package emart;

import java.awt.EventQueue;

//import javax.swing.JOptionPane;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

//import files.Admin;

import java.awt.Font;

public class nihi {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nihi window = new nihi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public nihi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdmin = new JButton("admin");
		btnAdmin.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Admin admi= new Admin();
				admi.setVisible(true);
				//frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
			}
		});
		btnAdmin.setBounds(168, 72, 89, 23);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnVisitor = new JButton("visitor");
		btnVisitor.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnVisitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Visitor visit = new Visitor();
				visit.setVisible(true);
				
			}
		});
		btnVisitor.setBounds(168, 131, 89, 23);
		frame.getContentPane().add(btnVisitor);
		
		JButton visitor = new JButton("user");
		visitor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User u = new User();
				u.setVisible(true);
			}
		});
		visitor.setFont(new Font("Sylfaen", Font.BOLD, 18));
		visitor.setBounds(168, 191, 89, 23);
		frame.getContentPane().add(visitor);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE E-MART");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcomeToThe.setBounds(66, 22, 322, 27);
		frame.getContentPane().add(lblWelcomeToThe);
		
	}
}
