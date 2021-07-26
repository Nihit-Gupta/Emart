package emart;

//import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.sun.prism.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Admin extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	public JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(31, 90, 66, 19);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(31, 140, 66, 19);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(140, 90, 188, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(140, 140, 188, 19);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String usn ="nihit";
				 String pwd ="123";
				 String u=textField.getText();
				 String p= new String(passwordField.getPassword());
				 if(usn.equals(u)&&pwd.equals(p))
				 {
					 JOptionPane.showMessageDialog(null,"successfully logged in");
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					 AdminFrame af = new AdminFrame();
					 af.setVisible(true);
					 
					 
				 }
				 else {
					JOptionPane.showMessageDialog(null,"invalid username or password"); 
				 }
			}
		});
		btnLogin.setBounds(178, 185, 89, 23);
		contentPane.add(btnLogin);	
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE E-MART");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcomeToThe.setBounds(71, 24, 333, 37);
		contentPane.add(lblWelcomeToThe);}

}
