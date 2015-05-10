package org.techsoft.sklad.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class FrameZ extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameZ frame = new FrameZ();
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
	public FrameZ() {
		setTitle("P\u0159ehled zak\u00E1zek");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 565, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel prehled = new JPanel();
		tabbedPane.addTab("P\u0159ehled", null, prehled, null);
		prehled.setLayout(null);
		
		JLabel lblZobrazitJednotlivZakzky = new JLabel("Zobrazit jednotliv\u00E9 zak\u00E1zky:");
		lblZobrazitJednotlivZakzky.setBounds(10, 11, 177, 14);
		prehled.add(lblZobrazitJednotlivZakzky);
		
		JRadioButton rdbtnDokon = new JRadioButton("Dokon\u010Den\u00E9");
		buttonGroup.add(rdbtnDokon);
		rdbtnDokon.setBounds(6, 32, 109, 23);
		prehled.add(rdbtnDokon);
		
		JRadioButton rdbtnNedokon = new JRadioButton("Nedokon\u010Den\u00E9");
		buttonGroup.add(rdbtnNedokon);
		rdbtnNedokon.setBounds(6, 58, 109, 23);
		prehled.add(rdbtnNedokon);
		
		JButton btnZobrazitStav = new JButton("Zobrazit");
		btnZobrazitStav.setBounds(121, 58, 89, 23);
		prehled.add(btnZobrazitStav);
	}
}
