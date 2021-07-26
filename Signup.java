package emart;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
 
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Signup() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterUsername = new JLabel("ENTER USERNAME");
		lblEnterUsername.setBounds(38, 111, 142, 19);
		contentPane.add(lblEnterUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(38, 140, 89, 19);
		contentPane.add(lblPassword);
		
		JLabel lblReEnterPassword = new JLabel("RE ENTER PASSWORD");
		lblReEnterPassword.setBounds(38, 169, 160, 19);
		contentPane.add(lblReEnterPassword);
		
		textField = new JTextField();
		textField.setBounds(208, 111, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSaveInfo = new JButton("SAVE  INFO");
		btnSaveInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				File f = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\detail.txt");
				
				try {
					f.createNewFile();
					
					Scanner s = new Scanner(f);
					FileWriter fw = new FileWriter("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\detail.txt",true);
					String d;
					int flag=0;
					String usn = textField.getText();
					String pass =passwordField .getText();
					String rpass =passwordField_1  .getText();
					while(s.hasNextLine()) {
						d = s.nextLine();
						if(d.equals(usn))
						{
							JOptionPane.showMessageDialog(null,"username already exists");
							s.close();
							flag=1;
							break;
						}
					}
					if(flag==0) {
					if(!pass.equals(rpass)) {
						JOptionPane.showMessageDialog(null,"passwords entered donot match");
					}
					else  {
					//	FileWriter fw = new FileWriter("detail.txt",true);
						fw.write("\r\n"+usn);
						fw.write("\r\n"+pass);
						fw.close();
						
						JOptionPane.showMessageDialog(null,"congrats you have successfully registered");
						
					}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnSaveInfo.setBounds(163, 216, 127, 19);
		contentPane.add(btnSaveInfo);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(208, 140, 86, 19);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(208, 169, 86, 19);
		contentPane.add(passwordField_1);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE E-MART");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcomeToThe.setBounds(68, 30, 316, 27);
		contentPane.add(lblWelcomeToThe);
		
	
	}
}


