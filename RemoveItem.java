package emart;
//import java.awt.BorderLayout;
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

public class RemoveItem extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveItem frame = new RemoveItem();
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
	public RemoveItem() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 477, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterTheItem = new JLabel("Enter the item name to remove");
		lblEnterTheItem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterTheItem.setBounds(10, 147, 232, 28);
		contentPane.add(lblEnterTheItem);
		
		textField = new JTextField();
		textField.setBounds(268, 147, 154, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Item i = new Item();
				String s= textField.getText();
				int flag=0;
				flag = i.removeItem(s,0);
				if(flag==1)
					JOptionPane.showMessageDialog(null, "item removed successfully");
				else
					JOptionPane.showMessageDialog(null,"item doesn't exist");
			}
		});
		btnRemove.setBounds(281, 203, 129, 23);
		contentPane.add(btnRemove);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE E-MART");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcomeToThe.setBounds(81, 33, 314, 41);
		contentPane.add(lblWelcomeToThe);
		
			}

}

