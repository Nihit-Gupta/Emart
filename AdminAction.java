package emart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
abstract class AdminAction {
	abstract int removeItem(String rem,int flag );
	abstract int addItem(String add);

}

class Item extends AdminAction{
	
	int removeItem(String rem,int flag) {
		int r=0;
		try {
			File oldfile,newfile,file;
			
			 if (flag==0) {
				 oldfile = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\med.txt");
				 newfile = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\med1.txt");
			 }
			 else {
				 oldfile = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart.txt");
				 newfile = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart1.txt"); 
			 }
			 Scanner s = new Scanner(oldfile);
			String d;
			newfile.createNewFile();
			
			 FileWriter fw1 = new FileWriter(newfile,true);
			fw1.flush();
			while(s.hasNextLine()) {
				d=s.nextLine();
				if(d.equals(rem)) {
					r=1;	
				}
				else {
					fw1.write(d);
					fw1.write("\r\n");
				}
			}
			s.close();
			 fw1.close();
			 
			 oldfile.delete();
			if(flag==0)
				file=new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\med.txt" ) ;
			else 
				file =new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\cart.txt" );
			
			  newfile.renameTo(file);
			 
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		if(flag==0&&r==1) {
			removeItem(rem,1);
		}
		return r;

	}
	
	
	int addItem(String add) {
		File file1 = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\med.txt");
		int f=0;
		Cart c = new Cart();
		int s = c.search(add);
		
		try {
			if(s==0) {
				f=1;
			FileWriter fw = new FileWriter(file1,true);
			fw.write("\r");
			fw.write(add);
			fw.write("\r\n");
			fw.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	
}