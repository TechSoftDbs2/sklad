package Gui2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;

public class FrameS extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameS frame = new FrameS();
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
	public FrameS() {
		setTitle("Sklad surovin a polotovar\u016F");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 565, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Suroviny", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNzev = new JLabel("N\u00E1zev:");
		lblNzev.setBounds(10, 40, 46, 14);
		panel.add(lblNzev);
		
		JLabel lblNewLabel = new JLabel("Po\u010Det kus\u016F:");
		lblNewLabel.setBounds(10, 65, 58, 14);
		panel.add(lblNewLabel);
		
		JLabel lblVha = new JLabel("V\u00E1ha:");
		lblVha.setBounds(10, 90, 46, 14);
		panel.add(lblVha);
		
		textField = new JTextField();
		textField.setBounds(91, 40, 122, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 65, 122, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 90, 122, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("P\u0159idat");
		btnNewButton.setBounds(124, 121, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblPidatSurov = new JLabel("P\u0159idat novou surovinu:");
		lblPidatSurov.setBounds(10, 11, 203, 14);
		panel.add(lblPidatSurov);
		
		JLabel lblVytvoitSpecifick = new JLabel("P\u0159idat druh k surovin\u011B: ");
		lblVytvoitSpecifick.setBounds(268, 11, 212, 14);
		panel.add(lblVytvoitSpecifick);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00E1zev:");
		lblNewLabel_1.setBounds(268, 65, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblMateril = new JLabel("Materi\u00E1l:");
		lblMateril.setBounds(268, 90, 46, 14);
		panel.add(lblMateril);
		
		textField_3 = new JTextField();
		textField_3.setBounds(358, 90, 122, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(358, 65, 122, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 163, 436, 14);
		panel.add(separator);
		
		JButton btnNewButton_1 = new JButton("P\u0159idat");
		btnNewButton_1.setBounds(391, 127, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblOdebratSurovinu = new JLabel("Upravit vlastnosti suroviny:");
		lblOdebratSurovinu.setBounds(10, 177, 203, 14);
		panel.add(lblOdebratSurovinu);
		
		JLabel label = new JLabel("N\u00E1zev:");
		label.setBounds(268, 204, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Po\u010Det kus\u016F:");
		label_1.setBounds(10, 227, 79, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("V\u00E1ha:");
		label_2.setBounds(10, 252, 46, 14);
		panel.add(label_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(324, 204, 122, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(91, 227, 122, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(91, 252, 122, 20);
		panel.add(textField_7);
		
		JButton btnUpravit = new JButton("Upravit");
		btnUpravit.setBounds(124, 283, 89, 23);
		panel.add(btnUpravit);
		
		JLabel lblOdebratSurovinu_1 = new JLabel("Odebrat surovinu:");
		lblOdebratSurovinu_1.setBounds(268, 177, 178, 14);
		panel.add(lblOdebratSurovinu_1);
		
		JLabel label_3 = new JLabel("N\u00E1zev:");
		label_3.setBounds(10, 202, 46, 14);
		panel.add(label_3);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(91, 202, 122, 20);
		panel.add(textField_8);
		
		JButton btnOdebrat = new JButton("Odebrat");
		btnOdebrat.setBounds(357, 283, 89, 23);
		panel.add(btnOdebrat);
		
		JLabel lblNzevSuroviny = new JLabel("N\u00E1zev suroviny:");
		lblNzevSuroviny.setBounds(268, 40, 89, 14);
		panel.add(lblNzevSuroviny);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(358, 40, 122, 20);
		panel.add(textField_14);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("V\u00FDrobky", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblPidatNovVrobek = new JLabel("P\u0159idat nov\u00FD v\u00FDrobek:");
		lblPidatNovVrobek.setBounds(10, 11, 161, 14);
		panel_3.add(lblPidatNovVrobek);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(91, 40, 122, 20);
		panel_3.add(textField_9);
		
		JLabel lblSeriovslo = new JLabel("Seriov\u00E9 \u010D\u00EDslo:");
		lblSeriovslo.setBounds(10, 40, 71, 14);
		panel_3.add(lblSeriovslo);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(91, 65, 122, 20);
		panel_3.add(textField_10);
		
		JLabel lblNzev_1 = new JLabel("N\u00E1zev:");
		lblNzev_1.setBounds(10, 65, 58, 14);
		panel_3.add(lblNzev_1);
		
		JLabel lblka = new JLabel("\u0160\u00ED\u0159ka:");
		lblka.setBounds(10, 90, 46, 14);
		panel_3.add(lblka);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(91, 90, 122, 20);
		panel_3.add(textField_11);
		
		JButton button = new JButton("P\u0159idat");
		button.setBounds(124, 173, 89, 23);
		panel_3.add(button);
		
		JLabel lblPidatDruhVrobku = new JLabel("P\u0159idat druh k v\u00FDrobku: ");
		lblPidatDruhVrobku.setBounds(268, 11, 178, 14);
		panel_3.add(lblPidatDruhVrobku);
		
		JLabel label_9 = new JLabel("N\u00E1zev:");
		label_9.setBounds(268, 65, 46, 14);
		panel_3.add(label_9);
		
		JLabel lblPouit = new JLabel("Pou\u017Eit\u00ED:");
		lblPouit.setBounds(268, 90, 46, 14);
		panel_3.add(lblPouit);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(377, 65, 122, 20);
		panel_3.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(377, 90, 122, 20);
		panel_3.add(textField_13);
		
		JButton button_1 = new JButton("P\u0159idat");
		button_1.setBounds(410, 173, 89, 23);
		panel_3.add(button_1);
		
		JLabel lblUpravitVlastnostiVrobku = new JLabel("Upravit vlastnosti v\u00FDrobku:");
		lblUpravitVlastnostiVrobku.setBounds(10, 254, 203, 14);
		panel_3.add(lblUpravitVlastnostiVrobku);
		
		JLabel lblOdebratVrobek = new JLabel("Odebrat v\u00FDrobek:");
		lblOdebratVrobek.setBounds(268, 254, 142, 14);
		panel_3.add(lblOdebratVrobek);
		
		JLabel label_13 = new JLabel("N\u00E1zev:");
		label_13.setBounds(268, 281, 46, 14);
		panel_3.add(label_13);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(324, 281, 122, 20);
		panel_3.add(textField_17);
		
		JButton button_3 = new JButton("Odebrat");
		button_3.setBounds(357, 360, 89, 23);
		panel_3.add(button_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 240, 436, 14);
		panel_3.add(separator_1);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(91, 115, 122, 20);
		panel_3.add(textField_18);
		
		JLabel lblVka = new JLabel("V\u00FD\u0161ka:");
		lblVka.setBounds(10, 115, 46, 14);
		panel_3.add(lblVka);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(91, 140, 122, 20);
		panel_3.add(textField_19);
		
		JLabel lblHloubka = new JLabel("Hloubka:");
		lblHloubka.setBounds(10, 140, 46, 14);
		panel_3.add(lblHloubka);
		
		JLabel lblNzevVrobku = new JLabel("N\u00E1zev v\u00FDrobku:");
		lblNzevVrobku.setBounds(268, 40, 110, 14);
		panel_3.add(lblNzevVrobku);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(377, 40, 122, 20);
		panel_3.add(textField_15);
		
		JLabel label_4 = new JLabel("Seriov\u00E9 \u010D\u00EDslo:");
		label_4.setBounds(10, 279, 83, 14);
		panel_3.add(label_4);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(91, 279, 122, 20);
		panel_3.add(textField_16);
		
		JLabel label_5 = new JLabel("N\u00E1zev:");
		label_5.setBounds(10, 304, 58, 14);
		panel_3.add(label_5);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(91, 304, 122, 20);
		panel_3.add(textField_20);
		
		JLabel label_6 = new JLabel("\u0160\u00ED\u0159ka:");
		label_6.setBounds(10, 329, 46, 14);
		panel_3.add(label_6);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(91, 329, 122, 20);
		panel_3.add(textField_21);
		
		JLabel label_7 = new JLabel("V\u00FD\u0161ka:");
		label_7.setBounds(10, 354, 46, 14);
		panel_3.add(label_7);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(91, 354, 122, 20);
		panel_3.add(textField_22);
		
		JLabel label_8 = new JLabel("Hloubka:");
		label_8.setBounds(10, 379, 46, 14);
		panel_3.add(label_8);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(91, 379, 122, 20);
		panel_3.add(textField_23);
		
		JButton button_2 = new JButton("P\u0159idat");
		button_2.setBounds(124, 412, 89, 23);
		panel_3.add(button_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Sledov\u00E1n\u00ED stavu", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Kusovn\u00EDk", null, panel_2, null);
	}
}
