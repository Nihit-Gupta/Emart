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
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Add extends JFrame {

	private JPanel contentPane;

	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add frame = new Add();
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
	public Add() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(98, 133, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterTheItem = new JLabel("ENTER THE ITEM NAME IN THE TEXT FIELD");
		lblEnterTheItem.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblEnterTheItem.setBounds(40, 196, 320, 20);
		contentPane.add(lblEnterTheItem);
		
		JButton btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String s = textField.getText();
			Use obj = new Use();
			int flag=obj.addToCart(s);
			if(flag==1) {
				JOptionPane.showMessageDialog(null, "added to the cart");
				//Use use = new Use(); 
			}
			else
				JOptionPane.showMessageDialog(null,"error in adding");
			}
		});
		btnAddToCart.setBounds(247, 132, 152, 21);
		contentPane.add(btnAddToCart);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE E-MART");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcomeToThe.setBounds(73, 36, 326, 27);
		contentPane.add(lblWelcomeToThe);
	}
}

