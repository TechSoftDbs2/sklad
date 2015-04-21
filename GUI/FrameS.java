package Gui3;

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
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class FrameS extends JFrame {

	private JPanel contentPane;
	private JTextField txsAddNazevSur;
	private JTextField txsAddKusy;
	private JTextField txsAddVaha;
	private JTextField txsAddMat;
	private JTextField txsAddNazevDruhu;
	private JTextField txsDelNazev;
	private JTextField txsUpdKusy;
	private JTextField txsUpdVaha;
	private JTextField txsUpdNazev;
	private JTextField txvAddSeri;
	private JTextField txvAddNazevVyr;
	private JTextField txvAddSirka;
	private JTextField txvAddNazevDruhu;
	private JTextField txvAddPouziti;
	private JTextField txvDelSeri;
	private JTextField txvAddVyska;
	private JTextField txvAddHloubka;
	private JTextField txsAddDruh;
	private JTextField txvAddDruh;
	private JTextField txvUpdSeri;
	private JTextField txvUpdNazevVyr;
	private JTextField txvUpdSirka;
	private JTextField txvUpdVyska;
	private JTextField txvUpdHloubka;

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
		
		txsAddNazevSur = new JTextField();
		txsAddNazevSur.setBounds(91, 40, 122, 20);
		panel.add(txsAddNazevSur);
		txsAddNazevSur.setColumns(10);
		
		txsAddKusy = new JTextField();
		txsAddKusy.setBounds(91, 65, 122, 20);
		panel.add(txsAddKusy);
		txsAddKusy.setColumns(10);
		
		txsAddVaha = new JTextField();
		txsAddVaha.setBounds(91, 90, 122, 20);
		panel.add(txsAddVaha);
		txsAddVaha.setColumns(10);
		
		JButton btnAddSur = new JButton("P\u0159idat");
		btnAddSur.setBounds(124, 121, 89, 23);
		panel.add(btnAddSur);
		
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
		
		txsAddMat = new JTextField();
		txsAddMat.setBounds(358, 90, 122, 20);
		panel.add(txsAddMat);
		txsAddMat.setColumns(10);
		
		txsAddNazevDruhu = new JTextField();
		txsAddNazevDruhu.setBounds(358, 65, 122, 20);
		panel.add(txsAddNazevDruhu);
		txsAddNazevDruhu.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 163, 514, 14);
		panel.add(separator);
		
		JButton btnAddDruh = new JButton("P\u0159idat");
		btnAddDruh.setBounds(391, 127, 89, 23);
		panel.add(btnAddDruh);
		
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
		
		txsDelNazev = new JTextField();
		txsDelNazev.setColumns(10);
		txsDelNazev.setBounds(358, 201, 122, 20);
		panel.add(txsDelNazev);
		
		txsUpdKusy = new JTextField();
		txsUpdKusy.setColumns(10);
		txsUpdKusy.setBounds(91, 227, 122, 20);
		panel.add(txsUpdKusy);
		
		txsUpdVaha = new JTextField();
		txsUpdVaha.setColumns(10);
		txsUpdVaha.setBounds(91, 252, 122, 20);
		panel.add(txsUpdVaha);
		
		JButton btnUpdSur = new JButton("Upravit");
		btnUpdSur.setBounds(124, 283, 89, 23);
		panel.add(btnUpdSur);
		
		JLabel lblOdebratSurovinu_1 = new JLabel("Odebrat surovinu:");
		lblOdebratSurovinu_1.setBounds(268, 177, 178, 14);
		panel.add(lblOdebratSurovinu_1);
		
		JLabel label_3 = new JLabel("N\u00E1zev:");
		label_3.setBounds(10, 202, 46, 14);
		panel.add(label_3);
		
		txsUpdNazev = new JTextField();
		txsUpdNazev.setColumns(10);
		txsUpdNazev.setBounds(91, 202, 122, 20);
		panel.add(txsUpdNazev);
		
		JButton btnDelSur = new JButton("Odebrat");
		btnDelSur.setBounds(391, 283, 89, 23);
		panel.add(btnDelSur);
		
		JLabel lblNzevSuroviny = new JLabel("N\u00E1zev suroviny:");
		lblNzevSuroviny.setBounds(268, 40, 89, 14);
		panel.add(lblNzevSuroviny);
		
		txsAddDruh = new JTextField();
		txsAddDruh.setColumns(10);
		txsAddDruh.setBounds(358, 40, 122, 20);
		panel.add(txsAddDruh);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("V\u00FDrobky", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblPidatNovVrobek = new JLabel("P\u0159idat nov\u00FD v\u00FDrobek:");
		lblPidatNovVrobek.setBounds(10, 11, 161, 14);
		panel_3.add(lblPidatNovVrobek);
		
		txvAddSeri = new JTextField();
		txvAddSeri.setColumns(10);
		txvAddSeri.setBounds(91, 40, 122, 20);
		panel_3.add(txvAddSeri);
		
		JLabel lblSeriovslo = new JLabel("Seriov\u00E9 \u010D\u00EDslo:");
		lblSeriovslo.setBounds(10, 40, 71, 14);
		panel_3.add(lblSeriovslo);
		
		txvAddNazevVyr = new JTextField();
		txvAddNazevVyr.setColumns(10);
		txvAddNazevVyr.setBounds(91, 65, 122, 20);
		panel_3.add(txvAddNazevVyr);
		
		JLabel lblNzev_1 = new JLabel("N\u00E1zev:");
		lblNzev_1.setBounds(10, 65, 58, 14);
		panel_3.add(lblNzev_1);
		
		JLabel lblka = new JLabel("\u0160\u00ED\u0159ka:");
		lblka.setBounds(10, 90, 46, 14);
		panel_3.add(lblka);
		
		txvAddSirka = new JTextField();
		txvAddSirka.setColumns(10);
		txvAddSirka.setBounds(91, 90, 122, 20);
		panel_3.add(txvAddSirka);
		
		JButton btnAddVyr = new JButton("P\u0159idat");
		btnAddVyr.setBounds(124, 173, 89, 23);
		panel_3.add(btnAddVyr);
		
		JLabel lblPidatDruhVrobku = new JLabel("P\u0159idat druh k v\u00FDrobku: ");
		lblPidatDruhVrobku.setBounds(268, 11, 178, 14);
		panel_3.add(lblPidatDruhVrobku);
		
		JLabel label_9 = new JLabel("N\u00E1zev:");
		label_9.setBounds(268, 65, 46, 14);
		panel_3.add(label_9);
		
		JLabel lblPouit = new JLabel("Pou\u017Eit\u00ED:");
		lblPouit.setBounds(268, 90, 46, 14);
		panel_3.add(lblPouit);
		
		txvAddNazevDruhu = new JTextField();
		txvAddNazevDruhu.setColumns(10);
		txvAddNazevDruhu.setBounds(377, 65, 122, 20);
		panel_3.add(txvAddNazevDruhu);
		
		txvAddPouziti = new JTextField();
		txvAddPouziti.setColumns(10);
		txvAddPouziti.setBounds(377, 90, 122, 20);
		panel_3.add(txvAddPouziti);
		
		JButton btnAddDruhVyr = new JButton("P\u0159idat");
		btnAddDruhVyr.setBounds(410, 173, 89, 23);
		panel_3.add(btnAddDruhVyr);
		
		JLabel lblUpravitVlastnostiVrobku = new JLabel("Upravit vlastnosti v\u00FDrobku:");
		lblUpravitVlastnostiVrobku.setBounds(10, 254, 203, 14);
		panel_3.add(lblUpravitVlastnostiVrobku);
		
		JLabel lblOdebratVrobek = new JLabel("Odebrat v\u00FDrobek:");
		lblOdebratVrobek.setBounds(268, 254, 142, 14);
		panel_3.add(lblOdebratVrobek);
		
		JLabel lblSeriovslo_1 = new JLabel("Seriov\u00E9 \u010D\u00EDslo:");
		lblSeriovslo_1.setBounds(268, 281, 99, 14);
		panel_3.add(lblSeriovslo_1);
		
		txvDelSeri = new JTextField();
		txvDelSeri.setColumns(10);
		txvDelSeri.setBounds(377, 279, 122, 20);
		panel_3.add(txvDelSeri);
		
		JButton btnDelVyr = new JButton("Odebrat");
		btnDelVyr.setBounds(410, 353, 89, 23);
		panel_3.add(btnDelVyr);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 240, 514, 14);
		panel_3.add(separator_1);
		
		txvAddVyska = new JTextField();
		txvAddVyska.setColumns(10);
		txvAddVyska.setBounds(91, 115, 122, 20);
		panel_3.add(txvAddVyska);
		
		JLabel lblVka = new JLabel("V\u00FD\u0161ka:");
		lblVka.setBounds(10, 115, 46, 14);
		panel_3.add(lblVka);
		
		txvAddHloubka = new JTextField();
		txvAddHloubka.setColumns(10);
		txvAddHloubka.setBounds(91, 140, 122, 20);
		panel_3.add(txvAddHloubka);
		
		JLabel lblHloubka = new JLabel("Hloubka:");
		lblHloubka.setBounds(10, 140, 46, 14);
		panel_3.add(lblHloubka);
		
		JLabel lblNazevVyrobku = new JLabel("N\u00E1zev v\u00FDrobku:");
		lblNazevVyrobku.setBounds(268, 40, 110, 14);
		panel_3.add(lblNazevVyrobku);
		
		txvAddDruh = new JTextField();
		txvAddDruh.setColumns(10);
		txvAddDruh.setBounds(377, 40, 122, 20);
		panel_3.add(txvAddDruh);
		
		JLabel label_4 = new JLabel("Seriov\u00E9 \u010D\u00EDslo:");
		label_4.setBounds(10, 279, 83, 14);
		panel_3.add(label_4);
		
		txvUpdSeri = new JTextField();
		txvUpdSeri.setColumns(10);
		txvUpdSeri.setBounds(91, 279, 122, 20);
		panel_3.add(txvUpdSeri);
		
		JLabel label_5 = new JLabel("N\u00E1zev:");
		label_5.setBounds(10, 304, 58, 14);
		panel_3.add(label_5);
		
		txvUpdNazevVyr = new JTextField();
		txvUpdNazevVyr.setColumns(10);
		txvUpdNazevVyr.setBounds(91, 304, 122, 20);
		panel_3.add(txvUpdNazevVyr);
		
		JLabel label_6 = new JLabel("\u0160\u00ED\u0159ka:");
		label_6.setBounds(10, 329, 46, 14);
		panel_3.add(label_6);
		
		txvUpdSirka = new JTextField();
		txvUpdSirka.setColumns(10);
		txvUpdSirka.setBounds(91, 329, 122, 20);
		panel_3.add(txvUpdSirka);
		
		JLabel label_7 = new JLabel("V\u00FD\u0161ka:");
		label_7.setBounds(10, 354, 46, 14);
		panel_3.add(label_7);
		
		txvUpdVyska = new JTextField();
		txvUpdVyska.setColumns(10);
		txvUpdVyska.setBounds(91, 354, 122, 20);
		panel_3.add(txvUpdVyska);
		
		JLabel label_8 = new JLabel("Hloubka:");
		label_8.setBounds(10, 379, 46, 14);
		panel_3.add(label_8);
		
		txvUpdHloubka = new JTextField();
		txvUpdHloubka.setColumns(10);
		txvUpdHloubka.setBounds(91, 379, 122, 20);
		panel_3.add(txvUpdHloubka);
		
		JButton btnUpdVyr = new JButton("P\u0159idat");
		btnUpdVyr.setBounds(124, 412, 89, 23);
		panel_3.add(btnUpdVyr);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Sledov\u00E1n\u00ED stavu", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblSledovnStavuSurovin = new JLabel("Sledov\u00E1n\u00ED stavu surovin");
		lblSledovnStavuSurovin.setBounds(10, 11, 156, 14);
		panel_1.add(lblSledovnStavuSurovin);
		
		JLabel lblNzev_2 = new JLabel("N\u00E1zev:");
		lblNzev_2.setBounds(10, 36, 57, 14);
		panel_1.add(lblNzev_2);
		
		JComboBox cmbNazevSur = new JComboBox();
		cmbNazevSur.setBounds(77, 33, 165, 20);
		panel_1.add(cmbNazevSur);
		
		JCheckBox chckbxKusy = new JCheckBox("Po\u010Det kus\u016F");
		chckbxKusy.setBounds(270, 7, 97, 23);
		panel_1.add(chckbxKusy);
		
		JCheckBox chckbxVaha = new JCheckBox("V\u00E1ha");
		chckbxVaha.setBounds(270, 32, 97, 23);
		panel_1.add(chckbxVaha);
		
		JCheckBox chckbxMaterial = new JCheckBox("Materi\u00E1l");
		chckbxMaterial.setBounds(270, 58, 97, 23);
		panel_1.add(chckbxMaterial);
		
		JCheckBox chckbxKontrolaMinima = new JCheckBox("Kontrola minima");
		chckbxKontrolaMinima.setBounds(369, 7, 128, 23);
		panel_1.add(chckbxKontrolaMinima);
		
		JButton btnZobrazSur = new JButton("Zobraz");
		btnZobrazSur.setBounds(10, 89, 89, 23);
		panel_1.add(btnZobrazSur);
		
		JLabel lblSledovnStavuVrobk = new JLabel("Sledov\u00E1n\u00ED stavu v\u00FDrobk\u016F");
		lblSledovnStavuVrobk.setBounds(10, 211, 156, 14);
		panel_1.add(lblSledovnStavuVrobk);
		
		JComboBox cmbNazevVyr = new JComboBox();
		cmbNazevVyr.setBounds(77, 233, 165, 20);
		panel_1.add(cmbNazevVyr);
		
		JLabel label_11 = new JLabel("N\u00E1zev:");
		label_11.setBounds(10, 236, 57, 14);
		panel_1.add(label_11);
		
		JButton btnZobrazVyr = new JButton("Zobraz");
		btnZobrazVyr.setBounds(10, 289, 89, 23);
		panel_1.add(btnZobrazVyr);
		
		JCheckBox chckbxSeri = new JCheckBox("Seriov\u00E9 \u010D\u00EDslo");
		chckbxSeri.setBounds(270, 207, 97, 23);
		panel_1.add(chckbxSeri);
		
		JCheckBox chckbxSirka = new JCheckBox("\u0160\u00ED\u0159ka");
		chckbxSirka.setBounds(270, 232, 97, 23);
		panel_1.add(chckbxSirka);
		
		JCheckBox chckbxVyska = new JCheckBox("V\u00FD\u0161ka");
		chckbxVyska.setBounds(270, 258, 97, 23);
		panel_1.add(chckbxVyska);
		
		JCheckBox chckbxHloubka = new JCheckBox("Hloubka");
		chckbxHloubka.setBounds(369, 207, 128, 23);
		panel_1.add(chckbxHloubka);
		
		JCheckBox chckbxPouziti = new JCheckBox("Pou\u017Eit\u00ED");
		chckbxPouziti.setBounds(369, 232, 97, 23);
		panel_1.add(chckbxPouziti);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 146, 514, 14);
		panel_1.add(separator_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Kusovn\u00EDk", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblSloenVrobku = new JLabel("Slo\u017Een\u00ED v\u00FDrobku:");
		lblSloenVrobku.setBounds(10, 20, 104, 14);
		panel_2.add(lblSloenVrobku);
		
		JComboBox cmbKusSlozeniVyr = new JComboBox();
		cmbKusSlozeniVyr.setBounds(252, 12, 146, 20);
		panel_2.add(cmbKusSlozeniVyr);
		
		JButton btnKusSlozeniVyr = new JButton("Zobraz");
		btnKusSlozeniVyr.setBounds(435, 11, 89, 23);
		panel_2.add(btnKusSlozeniVyr);
		
		JLabel lblVrobekObsahujeDanou = new JLabel("V\u00FDrobek obsahuj\u00EDc\u00ED surovinu:");
		lblVrobekObsahujeDanou.setBounds(10, 45, 178, 14);
		panel_2.add(lblVrobekObsahujeDanou);
		
		JComboBox cmbKusObsahujeSur = new JComboBox();
		cmbKusObsahujeSur.setBounds(252, 42, 146, 20);
		panel_2.add(cmbKusObsahujeSur);
		
		JButton btnKusObsahujeSur = new JButton("Zobraz");
		btnKusObsahujeSur.setBounds(435, 41, 89, 23);
		panel_2.add(btnKusObsahujeSur);
	}
}
