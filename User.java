package emart;

//import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class User extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(143, 138, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(21, 140, 86, 14);
		contentPane.add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 177, 86, 20);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(21, 178, 86, 17);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String u =textField.getText();
				String d;
				int flag=0,pflag=0;
				String p= (String)passwordField.getText();
				File f = new File("C:\\Users\\Nihit Gupta\\Desktop\\New folder\\detail.txt");
				try {
					Scanner s = new Scanner(f);
					while(s.hasNextLine()) {
						d=s.nextLine();
						if(d.equals(u)) {
							flag =1;
							break;
						}
							}
					while(s.hasNextLine()) {
						d=s.nextLine();
						if(d.equals(p)){
							pflag=1;
							break;
						}
					}
					if(flag==1&&pflag==1) {
						JOptionPane.showMessageDialog(null, "successfully loged in");
						UserFrame uf = new UserFrame();
						uf.setVisible(true);
						Use obj1 = new Use();
						
							obj1.setName(textField.getText());
						 
					}
					else {
						JOptionPane.showMessageDialog(null, "invalid username or password");
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnLogin.setBounds(287, 198, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE E-MART");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcomeToThe.setBounds(56, 48, 310, 27);
		contentPane.add(lblWelcomeToThe);
		
		
		
	}
}


