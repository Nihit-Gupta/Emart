package emart;


//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Visitor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visitor frame = new Visitor();
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
	public Visitor() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserPage = new JLabel("WELCOME TO THE E-MART");
		lblUserPage.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblUserPage.setBounds(67, 10, 328, 58);
		contentPane.add(lblUserPage);
		
		JButton btnNewButton = new JButton("view");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				View view = new View();
				view.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(166, 104, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Signup sign = new Signup();
				sign.setVisible(true);
			}
		});
		btnSignUp.setBounds(166, 173, 89, 23);
		contentPane.add(btnSignUp);
		
		
	}
}

