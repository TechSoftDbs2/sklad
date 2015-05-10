package org.techsoft.sklad.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtJmeno;
	private JPasswordField txtHeslo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("P\u0159ihl\u00E1\u0161en\u00ED");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 263, 137);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jm\u00E9no:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHeslo = new JLabel("Heslo:");
		lblHeslo.setBounds(10, 36, 46, 14);
		contentPane.add(lblHeslo);
		
		txtJmeno = new JTextField();
		txtJmeno.setBounds(66, 8, 130, 20);
		contentPane.add(txtJmeno);
		txtJmeno.setColumns(10);
		
		txtHeslo = new JPasswordField();
		txtHeslo.setBounds(66, 33, 130, 20);
		contentPane.add(txtHeslo);
		
		JButton btnPrihlasit = new JButton("P\u0159ihl\u00E1sit");
		btnPrihlasit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrihlasit.setBounds(107, 64, 89, 23);
		contentPane.add(btnPrihlasit);
	}
}
