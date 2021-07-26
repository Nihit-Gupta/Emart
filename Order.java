package emart;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Order extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
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
	public Order() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(25, 55, 195, 162);
		contentPane.add(scrollPane);
		
		JTextArea txtrAkaa = new JTextArea();
		 
		scrollPane.setViewportView(txtrAkaa);
		Use obj = new Use();
		String d= obj.placeOrder();
		txtrAkaa.setText(d);
		 
		
		
		JButton btnPlaceOrder = new JButton("place order");
		btnPlaceOrder.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Use obj = new Use();
				String d=obj.placeOrder();
				Cart x = new Cart();
				int flag = x.getflag();
				if(d==""||flag==0) {
					JOptionPane.showMessageDialog(null,"no item to place");
				}
				else  {
					JOptionPane.showMessageDialog(null,"order placed");
					txtrAkaa.setText(null);
					//Use obj = new Use();
					obj.removeFromCart();
					//s="";
					
					//delete text code from file
					}

				
			}
		});
		btnPlaceOrder.setBounds(255, 106, 141, 23);
		contentPane.add(btnPlaceOrder);
	}
}
