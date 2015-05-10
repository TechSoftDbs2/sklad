package org.techsoft.sklad.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Okno {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okno window = new Okno();
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
	public Okno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Skladová evidence");
		frame.setBounds(100, 100, 230, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Sklad surovin a polotovar\u016F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameS f1 = new FrameS();
				f1.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 31, 194, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Odd\u011Blen\u00ED v\u00FDroby");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrameV f2 = new FrameV();
				f2.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(10, 106, 194, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("P\u0159ehled zak\u00E1zek");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameZ f3 = new FrameZ();
				f3.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 181, 194, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
