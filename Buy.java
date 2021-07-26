package emart;

import java.io.*;
import java.util.*;

abstract class Buy {
	//abstract String view();
	 String view() {
			File f = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\med.txt");
			Scanner s;
			 String d="";
			try {
				s = new Scanner(f);
				
				while(s.hasNextLine()) {
					d+=s.nextLine();
					d+="\n";
					
			}
				s.close();
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return d;
	 }
	abstract  int addToCart(String u);
	abstract String placeOrder();
	abstract  void removeFromCart();
}


class Cart{
	static String usn;
	Cart(){
		
	}
	Cart(String p){
		usn =p;
		
	}
	String item[] = new String[100];
	 
	int check[]=new int[100];
	int search(String s) {
		
		int flag=0;
		File f = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\med.txt");
		try {
			Scanner p = new Scanner(f);
			while(p.hasNextLine()) {
				String d= p.nextLine();
				if(d.equals(s)) {
					flag =1;
					break;
				}
			}
			p.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		return flag;
		
	}
	static int x =1;//for ordering
	int getflag() {
		if(x==1) {
			x++;
			return 1;
		}
		else
			return 0;
		
	}
}


class Use extends Buy{
	 
	 
	 int addToCart(String v) {
		 Cart obj = new Cart();
		 String usn =obj.usn;
		 obj.x=1;
		 int f = obj.search(v);//is the item available
		int z=0;//for first line spacing in cart file
			try {
				
				if(f==1) {
					File oldfile = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart.txt");
					oldfile.createNewFile();
					File newfile = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart1.txt");
					newfile.createNewFile();
					Scanner s = new Scanner(oldfile);
					String d;
					newfile.createNewFile();
					
					 FileWriter fw1 = new FileWriter(newfile,true);
					fw1.flush();
					while(s.hasNextLine()) {
						d=s.nextLine();
						if(d.equals(usn)) {
							if(z==0) {
								fw1.write(d);
								fw1.write("\r\n");
								fw1.write(v);
							}
							else {
							fw1.write("\r\n");
							fw1.write(d);
							fw1.write("\r\n");
							fw1.write(v);
							}
						}else {
							if(z==0) {
								fw1.write(d);
							}
							else {
							fw1.write("\r\n");	
						fw1.write(d);
							}
						
						}
						z++;
					}
					s.close();
					 fw1.close();
					oldfile.delete();
					 File file3 =new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart.txt" );
					 newfile.renameTo(file3);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return f;
		}
	 
	 
	 void setName(String p) throws IOException {
		 Cart obj = new Cart(p);
		 int flag=0;
		 File f = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart.txt");
		 Scanner s = new Scanner(f);
		 while(s.hasNextLine()) {
			 String d= s.nextLine();
			 if(d.equals(p)) {
				flag=1;
				break;
			 }
		 }
		 s.close();
		 if(flag==0) {
			FileWriter fw = new FileWriter("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart.txt",true);
			fw.write("\r");
			fw.write(p);
			fw.write("\r\n");
			fw.write(";");
			
			fw.close();
		 }
	 }
	 
	 
	 String placeOrder() {
		 File file = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart.txt");
		 Cart obj = new Cart();
		 String usn = obj.usn;
		 String y;
		 String result="";
		 int f =0;
		 try {
			Scanner s = new Scanner(file);
			
			while(s.hasNextLine()) {
				
				y = s.nextLine();
				if(y.equals(usn)) {
					while(s.hasNextLine()) {
						y=s.nextLine();
						if(y.equals(";")){
							f=1;
							break;
						}
						else {
							result+=y;
							result+="\n";
						}
						
					}
					
				}
				if(f==1) 
					break;
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		 return result;
	 }
	 
	 void removeFromCart() {
		 Cart obj = new Cart();
		  String usn =obj.usn;
		 int c=0;
			try {
				 
					File oldfile = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart.txt");
					File newfile = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart1.txt");
					Scanner s = new Scanner(oldfile);
					String d;
					newfile.createNewFile();
					
					 FileWriter fw1 = new FileWriter(newfile,true);
					fw1.flush();
					while(s.hasNextLine()) {
						d=s.nextLine();
						if(d.equals(usn)) {
							if(c==0) {
								fw1.write(usn);
							}
							else {
							fw1.write("\r\n");
							fw1.write(usn);
							}
							c++;
							while(s.hasNextLine()) {
								d=s.nextLine();
								if(d.equals(";")) {
									fw1.write("\r\n");
								fw1.write(";");	
								break;
								}
							}
						}else {
							fw1.write("\r\n");	
						fw1.write(d);
						
						}
					}
					s.close();
					 fw1.close();
					oldfile.delete();
					 File file3 =new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart.txt" );
					 newfile.renameTo(file3);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 

}
 
}