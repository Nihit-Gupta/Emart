package emart;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class UserFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame();
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
	public UserFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnView = new JButton("view");
		btnView.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				View view = new View();
				view.setVisible(true);
			}
		});
		btnView.setBounds(32, 208, 89, 23);
		contentPane.add(btnView);
		
		JButton btnAdd = new JButton("add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Add a = new Add();
				a.setVisible(true);
			}
		});
		btnAdd.setBounds(174, 208, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnOrder = new JButton("order");
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Order order = new Order();
				order.setVisible(true);
				
				
			}
		});
		btnOrder.setBounds(308, 208, 89, 23);
		contentPane.add(btnOrder);
		
		JLabel lblNewLabel = new JLabel("USER OPTIONS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(145, 126, 202, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblWelcomeToThe = new JLabel("WELCOME TO THE E-MART");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblWelcomeToThe.setBounds(74, 40, 323, 34);
		contentPane.add(lblWelcomeToThe);
		
		
	}
}
