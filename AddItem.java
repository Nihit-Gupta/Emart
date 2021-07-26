package emart;


import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AddItem extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddItem frame = new AddItem();
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
	public AddItem() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheItem = new JLabel("Enter the item name to add");
		lblEnterTheItem.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblEnterTheItem.setBounds(23, 118, 189, 43);
		contentPane.add(lblEnterTheItem);
		
		textField = new JTextField();
		textField.setBounds(247, 127, 179, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("add");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Item i = new Item();
				int flag = i.addItem(textField.getText());
				if(flag==1)
					JOptionPane.showMessageDialog(null,"item added successfully");
				else
					JOptionPane.showMessageDialog(null,"item already exist");
			}
		});
		btnNewButton.setBounds(166, 188, 115, 33);
		contentPane.add(btnNewButton);	
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE E-MART");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcomeToThe.setBounds(53, 39, 331, 33);
		contentPane.add(lblWelcomeToThe);}

}

