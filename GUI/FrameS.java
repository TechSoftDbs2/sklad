package Gui;

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
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class FrameS extends JFrame {

	private JPanel contentPane;
	private JTextField txsAddNazevSur;
	private JTextField txsAddKusy;
	private JTextField txsAddVaha;
	private JTextField txsAddMat;
	private JTextField txsUpdKusy;
	private JTextField txsUpdVaha;
	private JTextField txsUpdNazev;
	private JTextField txvAddSeri;
	private JTextField txvAddNazevVyr;
	private JTextField txvAddSirka;
	private JTextField txvAddVyska;
	private JTextField txvAddHloubka;
	private JTextField txsAddDruh;
	private JTextField txvAddDruh;
	private JTextField txvUpdNazev;
	private JTextField txvUpdSirka;
	private JTextField txvUpdVyska;
	private JTextField txvUpdHloubka;
	private JTextField txsUpdMat;
	private JTextField txtAddKus;

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
		
		JPanel suroviny = new JPanel();
		tabbedPane.addTab("Suroviny", null, suroviny, null);
		suroviny.setLayout(null);
		
		JLabel lblNzev = new JLabel("N\u00E1zev:");
		lblNzev.setBounds(10, 40, 46, 14);
		suroviny.add(lblNzev);
		
		JLabel lblNewLabel = new JLabel("Po\u010Det kus\u016F:");
		lblNewLabel.setBounds(10, 115, 79, 14);
		suroviny.add(lblNewLabel);
		
		JLabel lblVha = new JLabel("V\u00E1ha:");
		lblVha.setBounds(10, 140, 46, 14);
		suroviny.add(lblVha);
		
		txsAddNazevSur = new JTextField();
		txsAddNazevSur.setBounds(91, 40, 122, 20);
		suroviny.add(txsAddNazevSur);
		txsAddNazevSur.setColumns(10);
		
		txsAddKusy = new JTextField();
		txsAddKusy.setBounds(91, 115, 122, 20);
		suroviny.add(txsAddKusy);
		txsAddKusy.setColumns(10);
		
		txsAddVaha = new JTextField();
		txsAddVaha.setBounds(91, 140, 122, 20);
		suroviny.add(txsAddVaha);
		txsAddVaha.setColumns(10);
		
		JButton btnAddSur = new JButton("P\u0159idat");
		btnAddSur.setBounds(124, 171, 89, 23);
		suroviny.add(btnAddSur);
		
		JLabel lblPidatSurov = new JLabel("P\u0159idat novou surovinu:");
		lblPidatSurov.setBounds(10, 11, 203, 14);
		suroviny.add(lblPidatSurov);
		
		JLabel lblVytvoitSpecifick = new JLabel("P\u0159idat druh suroviny: ");
		lblVytvoitSpecifick.setBounds(268, 11, 212, 14);
		suroviny.add(lblVytvoitSpecifick);
		
		JLabel lblNewLabel_1 = new JLabel("Druh:");
		lblNewLabel_1.setBounds(10, 65, 46, 14);
		suroviny.add(lblNewLabel_1);
		
		JLabel lblMateril = new JLabel("Materi\u00E1l:");
		lblMateril.setBounds(10, 90, 79, 14);
		suroviny.add(lblMateril);
		
		txsAddMat = new JTextField();
		txsAddMat.setBounds(91, 90, 122, 20);
		suroviny.add(txsAddMat);
		txsAddMat.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(238, 205, 286, 14);
		suroviny.add(separator);
		
		JButton btnAddDruh = new JButton("P\u0159idat");
		btnAddDruh.setBounds(391, 71, 89, 23);
		suroviny.add(btnAddDruh);
		
		JLabel lblOdebratSurovinu = new JLabel("Upravit vlastnosti suroviny:");
		lblOdebratSurovinu.setBounds(10, 230, 203, 14);
		suroviny.add(lblOdebratSurovinu);
		
		JLabel label = new JLabel("N\u00E1zev:");
		label.setBounds(268, 257, 46, 14);
		suroviny.add(label);
		
		JLabel label_1 = new JLabel("Po\u010Det kus\u016F:");
		label_1.setBounds(10, 330, 79, 14);
		suroviny.add(label_1);
		
		JLabel label_2 = new JLabel("V\u00E1ha:");
		label_2.setBounds(10, 355, 46, 14);
		suroviny.add(label_2);
		
		txsUpdKusy = new JTextField();
		txsUpdKusy.setColumns(10);
		txsUpdKusy.setBounds(91, 330, 122, 20);
		suroviny.add(txsUpdKusy);
		
		txsUpdVaha = new JTextField();
		txsUpdVaha.setColumns(10);
		txsUpdVaha.setBounds(91, 355, 122, 20);
		suroviny.add(txsUpdVaha);
		
		JButton btnUpdSur = new JButton("Upravit");
		btnUpdSur.setBounds(124, 386, 89, 23);
		suroviny.add(btnUpdSur);
		
		JLabel lblOdebratSurovinu_1 = new JLabel("Odebrat surovinu:");
		lblOdebratSurovinu_1.setBounds(268, 230, 178, 14);
		suroviny.add(lblOdebratSurovinu_1);
		
		JLabel label_3 = new JLabel("N\u00E1zev:");
		label_3.setBounds(10, 255, 46, 14);
		suroviny.add(label_3);
		
		txsUpdNazev = new JTextField();
		txsUpdNazev.setColumns(10);
		txsUpdNazev.setBounds(91, 255, 122, 20);
		suroviny.add(txsUpdNazev);
		
		JButton btnDelSur = new JButton("Odebrat");
		btnDelSur.setBounds(391, 285, 89, 23);
		suroviny.add(btnDelSur);
		
		JLabel lblNzevSuroviny = new JLabel("N\u00E1zev:");
		lblNzevSuroviny.setBounds(268, 40, 89, 14);
		suroviny.add(lblNzevSuroviny);
		
		txsAddDruh = new JTextField();
		txsAddDruh.setColumns(10);
		txsAddDruh.setBounds(358, 40, 122, 20);
		suroviny.add(txsAddDruh);
		
		JLabel lblOdebratDruhSuroviny = new JLabel("Odebrat druh suroviny:");
		lblOdebratDruhSuroviny.setBounds(268, 115, 147, 14);
		suroviny.add(lblOdebratDruhSuroviny);
		
		JLabel lblNzev_3 = new JLabel("N\u00E1zev:");
		lblNzev_3.setBounds(268, 140, 46, 14);
		suroviny.add(lblNzev_3);
		
		JComboBox cmbDelDruhSur = new JComboBox();
		cmbDelDruhSur.setBounds(358, 137, 122, 20);
		suroviny.add(cmbDelDruhSur);
		
		JButton btnDelDruhSur = new JButton("Odebrat");
		btnDelDruhSur.setBounds(391, 168, 89, 23);
		suroviny.add(btnDelDruhSur);
		
		JLabel lblDruh = new JLabel("Druh:");
		lblDruh.setBounds(10, 280, 46, 14);
		suroviny.add(lblDruh);
		
		JLabel lblNewLabel_2 = new JLabel("Materi\u00E1l:");
		lblNewLabel_2.setBounds(10, 305, 71, 14);
		suroviny.add(lblNewLabel_2);
		
		JComboBox cmbUpdDruhSur = new JComboBox();
		cmbUpdDruhSur.setBounds(91, 280, 122, 20);
		suroviny.add(cmbUpdDruhSur);
		
		txsUpdMat = new JTextField();
		txsUpdMat.setBounds(91, 305, 122, 20);
		suroviny.add(txsUpdMat);
		txsUpdMat.setColumns(10);
		
		JComboBox cmbAddDruhSur = new JComboBox();
		cmbAddDruhSur.setBounds(91, 65, 122, 20);
		suroviny.add(cmbAddDruhSur);
		
		JComboBox cmbDelSur = new JComboBox();
		cmbDelSur.setBounds(358, 254, 122, 20);
		suroviny.add(cmbDelSur);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(238, 10, 7, 195);
		suroviny.add(separator_3);
		
		JPanel vyrobky = new JPanel();
		tabbedPane.addTab("V\u00FDrobky", null, vyrobky, null);
		vyrobky.setLayout(null);
		
		JLabel lblPidatNovVrobek = new JLabel("P\u0159idat nov\u00FD v\u00FDrobek:");
		lblPidatNovVrobek.setBounds(10, 11, 161, 14);
		vyrobky.add(lblPidatNovVrobek);
		
		txvAddSeri = new JTextField();
		txvAddSeri.setColumns(10);
		txvAddSeri.setBounds(91, 40, 122, 20);
		vyrobky.add(txvAddSeri);
		
		JLabel lblSeriovslo = new JLabel("Seriov\u00E9 \u010D\u00EDslo:");
		lblSeriovslo.setBounds(10, 40, 83, 14);
		vyrobky.add(lblSeriovslo);
		
		txvAddNazevVyr = new JTextField();
		txvAddNazevVyr.setColumns(10);
		txvAddNazevVyr.setBounds(91, 65, 122, 20);
		vyrobky.add(txvAddNazevVyr);
		
		JLabel lblNzev_1 = new JLabel("N\u00E1zev:");
		lblNzev_1.setBounds(10, 65, 58, 14);
		vyrobky.add(lblNzev_1);
		
		JLabel lblka = new JLabel("\u0160\u00ED\u0159ka:");
		lblka.setBounds(10, 115, 58, 14);
		vyrobky.add(lblka);
		
		txvAddSirka = new JTextField();
		txvAddSirka.setColumns(10);
		txvAddSirka.setBounds(91, 115, 122, 20);
		vyrobky.add(txvAddSirka);
		
		JButton btnAddVyr = new JButton("P\u0159idat");
		btnAddVyr.setBounds(124, 198, 89, 23);
		vyrobky.add(btnAddVyr);
		
		JLabel lblPidatDruhVrobku = new JLabel("P\u0159idat druh v\u00FDrobku: ");
		lblPidatDruhVrobku.setBounds(268, 11, 178, 14);
		vyrobky.add(lblPidatDruhVrobku);
		
		JLabel lblDruh_1 = new JLabel("Druh:");
		lblDruh_1.setBounds(10, 90, 46, 14);
		vyrobky.add(lblDruh_1);
		
		JButton btnAddDruhVyr = new JButton("P\u0159idat");
		btnAddDruhVyr.setBounds(391, 71, 89, 23);
		vyrobky.add(btnAddDruhVyr);
		
		JLabel lblUpravitVlastnostiVrobku = new JLabel("Upravit vlastnosti v\u00FDrobku:");
		lblUpravitVlastnostiVrobku.setBounds(10, 239, 203, 14);
		vyrobky.add(lblUpravitVlastnostiVrobku);
		
		JLabel lblOdebratVrobek = new JLabel("Odebrat v\u00FDrobek:");
		lblOdebratVrobek.setBounds(268, 239, 142, 14);
		vyrobky.add(lblOdebratVrobek);
		
		JLabel lblSeriovslo_1 = new JLabel("Seriov\u00E9 \u010D\u00EDslo:");
		lblSeriovslo_1.setBounds(268, 264, 99, 14);
		vyrobky.add(lblSeriovslo_1);
		
		JButton btnDelVyr = new JButton("Odebrat");
		btnDelVyr.setBounds(391, 295, 89, 23);
		vyrobky.add(btnDelVyr);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(238, 226, 286, 14);
		vyrobky.add(separator_1);
		
		txvAddVyska = new JTextField();
		txvAddVyska.setColumns(10);
		txvAddVyska.setBounds(91, 140, 122, 20);
		vyrobky.add(txvAddVyska);
		
		JLabel lblVka = new JLabel("V\u00FD\u0161ka:");
		lblVka.setBounds(10, 140, 71, 14);
		vyrobky.add(lblVka);
		
		txvAddHloubka = new JTextField();
		txvAddHloubka.setColumns(10);
		txvAddHloubka.setBounds(91, 165, 122, 20);
		vyrobky.add(txvAddHloubka);
		
		JLabel lblHloubka = new JLabel("Hloubka:");
		lblHloubka.setBounds(10, 165, 71, 14);
		vyrobky.add(lblHloubka);
		
		JLabel lblNazevVyrobku = new JLabel("N\u00E1zev:");
		lblNazevVyrobku.setBounds(268, 40, 80, 14);
		vyrobky.add(lblNazevVyrobku);
		
		txvAddDruh = new JTextField();
		txvAddDruh.setColumns(10);
		txvAddDruh.setBounds(358, 40, 122, 20);
		vyrobky.add(txvAddDruh);
		
		JLabel label_4 = new JLabel("Seriov\u00E9 \u010D\u00EDslo:");
		label_4.setBounds(10, 264, 83, 14);
		vyrobky.add(label_4);
		
		JLabel label_5 = new JLabel("N\u00E1zev:");
		label_5.setBounds(10, 289, 58, 14);
		vyrobky.add(label_5);
		
		txvUpdNazev = new JTextField();
		txvUpdNazev.setColumns(10);
		txvUpdNazev.setBounds(91, 289, 122, 20);
		vyrobky.add(txvUpdNazev);
		
		JLabel label_6 = new JLabel("\u0160\u00ED\u0159ka:");
		label_6.setBounds(10, 339, 58, 14);
		vyrobky.add(label_6);
		
		txvUpdSirka = new JTextField();
		txvUpdSirka.setColumns(10);
		txvUpdSirka.setBounds(91, 339, 122, 20);
		vyrobky.add(txvUpdSirka);
		
		JLabel label_7 = new JLabel("V\u00FD\u0161ka:");
		label_7.setBounds(10, 364, 58, 14);
		vyrobky.add(label_7);
		
		txvUpdVyska = new JTextField();
		txvUpdVyska.setColumns(10);
		txvUpdVyska.setBounds(91, 364, 122, 20);
		vyrobky.add(txvUpdVyska);
		
		JLabel label_8 = new JLabel("Hloubka:");
		label_8.setBounds(10, 389, 71, 14);
		vyrobky.add(label_8);
		
		txvUpdHloubka = new JTextField();
		txvUpdHloubka.setColumns(10);
		txvUpdHloubka.setBounds(91, 389, 122, 20);
		vyrobky.add(txvUpdHloubka);
		
		JButton btnUpdVyr = new JButton("Upravit");
		btnUpdVyr.setBounds(124, 420, 89, 23);
		vyrobky.add(btnUpdVyr);
		
		JComboBox cmbAddDruhVyr = new JComboBox();
		cmbAddDruhVyr.setBounds(91, 90, 122, 20);
		vyrobky.add(cmbAddDruhVyr);
		
		JLabel lblNzev_4 = new JLabel("Odebrat druh v\u00FDrobku:");
		lblNzev_4.setBounds(268, 115, 142, 14);
		vyrobky.add(lblNzev_4);
		
		JLabel lblNzev_5 = new JLabel("N\u00E1zev:");
		lblNzev_5.setBounds(268, 143, 46, 14);
		vyrobky.add(lblNzev_5);
		
		JComboBox cmbDelDruhVyr = new JComboBox();
		cmbDelDruhVyr.setBounds(358, 140, 122, 20);
		vyrobky.add(cmbDelDruhVyr);
		
		JComboBox cmbUpdSeri = new JComboBox();
		cmbUpdSeri.setBounds(91, 264, 122, 20);
		vyrobky.add(cmbUpdSeri);
		
		JComboBox cmbDelVyr = new JComboBox();
		cmbDelVyr.setBounds(358, 264, 122, 20);
		vyrobky.add(cmbDelVyr);
		
		JLabel lblDruh_2 = new JLabel("Druh:");
		lblDruh_2.setBounds(10, 314, 46, 14);
		vyrobky.add(lblDruh_2);
		
		JComboBox cmbUpdDruh = new JComboBox();
		cmbUpdDruh.setBounds(91, 314, 122, 20);
		vyrobky.add(cmbUpdDruh);
		
		JButton btnDelDruhVyr = new JButton("Odebrat");
		btnDelDruhVyr.setBounds(391, 170, 89, 23);
		vyrobky.add(btnDelDruhVyr);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(238, 10, 7, 216);
		vyrobky.add(separator_4);
		
		JPanel schema = new JPanel();
		tabbedPane.addTab("Sch\u00E9ma v\u00FDrobku", null, schema, null);
		schema.setLayout(null);
		
		JLabel lblPiazenSurovinK = new JLabel("P\u0159i\u0159adit surovinu k v\u00FDrobku:");
		lblPiazenSurovinK.setBounds(10, 11, 203, 14);
		schema.add(lblPiazenSurovinK);
		
		JLabel lblVrobek = new JLabel("V\u00FDrobek:");
		lblVrobek.setBounds(10, 40, 64, 14);
		schema.add(lblVrobek);
		
		JLabel lblSurovina = new JLabel("Surovina:");
		lblSurovina.setBounds(10, 65, 64, 14);
		schema.add(lblSurovina);
		
		JLabel lblPoetKus = new JLabel("Po\u010Det kus\u016F:");
		lblPoetKus.setBounds(10, 90, 81, 14);
		schema.add(lblPoetKus);
		
		txtAddKus = new JTextField();
		txtAddKus.setBounds(91, 90, 122, 20);
		schema.add(txtAddKus);
		txtAddKus.setColumns(10);
		
		JComboBox cmbAddSchemaSur = new JComboBox();
		cmbAddSchemaSur.setBounds(91, 65, 122, 20);
		schema.add(cmbAddSchemaSur);
		
		JComboBox cmbAddSchemaVyr = new JComboBox();
		cmbAddSchemaVyr.setBounds(91, 40, 122, 20);
		schema.add(cmbAddSchemaVyr);
		
		JButton btnAddSchema = new JButton("P\u0159idat");
		btnAddSchema.setBounds(124, 121, 89, 23);
		schema.add(btnAddSchema);
		
		JLabel lblOdebrnSurovinOd = new JLabel("Odebrat surovinu od v\u00FDrobku:");
		lblOdebrnSurovinOd.setBounds(10, 155, 203, 14);
		schema.add(lblOdebrnSurovinOd);
		
		JLabel label_10 = new JLabel("V\u00FDrobek:");
		label_10.setBounds(10, 184, 64, 14);
		schema.add(label_10);
		
		JComboBox cmbDelSchemaVyr = new JComboBox();
		cmbDelSchemaVyr.setBounds(91, 184, 122, 20);
		schema.add(cmbDelSchemaVyr);
		
		JLabel label_12 = new JLabel("Surovina:");
		label_12.setBounds(10, 209, 64, 14);
		schema.add(label_12);
		
		JComboBox cmbDelSchemaSur = new JComboBox();
		cmbDelSchemaSur.setBounds(91, 209, 122, 20);
		schema.add(cmbDelSchemaSur);
		
		JButton btnDelSchema = new JButton("Odebrat");
		btnDelSchema.setBounds(124, 240, 89, 23);
		schema.add(btnDelSchema);
		
		JPanel sledovani_stavu = new JPanel();
		tabbedPane.addTab("Sledov\u00E1n\u00ED stavu", null, sledovani_stavu, null);
		sledovani_stavu.setLayout(null);
		
		JLabel lblSledovnStavuSurovin = new JLabel("Sledov\u00E1n\u00ED stavu surovin");
		lblSledovnStavuSurovin.setBounds(10, 11, 156, 14);
		sledovani_stavu.add(lblSledovnStavuSurovin);
		
		JLabel lblNzev_2 = new JLabel("N\u00E1zev:");
		lblNzev_2.setBounds(10, 36, 57, 14);
		sledovani_stavu.add(lblNzev_2);
		
		JComboBox cmbNazevSur = new JComboBox();
		cmbNazevSur.setBounds(77, 33, 165, 20);
		sledovani_stavu.add(cmbNazevSur);
		
		JCheckBox chckbxKusy = new JCheckBox("Po\u010Det kus\u016F");
		chckbxKusy.setBounds(270, 7, 97, 23);
		sledovani_stavu.add(chckbxKusy);
		
		JCheckBox chckbxVaha = new JCheckBox("V\u00E1ha");
		chckbxVaha.setBounds(270, 32, 97, 23);
		sledovani_stavu.add(chckbxVaha);
		
		JCheckBox chckbxMaterial = new JCheckBox("Materi\u00E1l");
		chckbxMaterial.setBounds(270, 58, 97, 23);
		sledovani_stavu.add(chckbxMaterial);
		
		JCheckBox chckbxKontrolaMinima = new JCheckBox("Kontrola minima");
		chckbxKontrolaMinima.setBounds(369, 7, 128, 23);
		sledovani_stavu.add(chckbxKontrolaMinima);
		
		JButton btnZobrazSur = new JButton("Zobraz");
		btnZobrazSur.setBounds(10, 89, 89, 23);
		sledovani_stavu.add(btnZobrazSur);
		
		JLabel lblSledovnStavuVrobk = new JLabel("Sledov\u00E1n\u00ED stavu v\u00FDrobk\u016F");
		lblSledovnStavuVrobk.setBounds(10, 211, 156, 14);
		sledovani_stavu.add(lblSledovnStavuVrobk);
		
		JComboBox cmbNazevVyr = new JComboBox();
		cmbNazevVyr.setBounds(77, 233, 165, 20);
		sledovani_stavu.add(cmbNazevVyr);
		
		JLabel label_11 = new JLabel("N\u00E1zev:");
		label_11.setBounds(10, 236, 57, 14);
		sledovani_stavu.add(label_11);
		
		JButton btnZobrazVyr = new JButton("Zobraz");
		btnZobrazVyr.setBounds(10, 289, 89, 23);
		sledovani_stavu.add(btnZobrazVyr);
		
		JCheckBox chckbxSeri = new JCheckBox("Seriov\u00E9 \u010D\u00EDslo");
		chckbxSeri.setBounds(270, 207, 102, 23);
		sledovani_stavu.add(chckbxSeri);
		
		JCheckBox chckbxSirka = new JCheckBox("\u0160\u00ED\u0159ka");
		chckbxSirka.setBounds(270, 232, 97, 23);
		sledovani_stavu.add(chckbxSirka);
		
		JCheckBox chckbxVyska = new JCheckBox("V\u00FD\u0161ka");
		chckbxVyska.setBounds(270, 258, 97, 23);
		sledovani_stavu.add(chckbxVyska);
		
		JCheckBox chckbxHloubka = new JCheckBox("Hloubka");
		chckbxHloubka.setBounds(369, 207, 128, 23);
		sledovani_stavu.add(chckbxHloubka);
		
		JCheckBox chckbxPouziti = new JCheckBox("Pou\u017Eit\u00ED");
		chckbxPouziti.setBounds(369, 232, 97, 23);
		sledovani_stavu.add(chckbxPouziti);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 146, 514, 14);
		sledovani_stavu.add(separator_2);
		
		JPanel kusovnik = new JPanel();
		tabbedPane.addTab("Kusovn\u00EDk", null, kusovnik, null);
		kusovnik.setLayout(null);
		
		JLabel lblSloenVrobku = new JLabel("Slo\u017Een\u00ED v\u00FDrobku:");
		lblSloenVrobku.setBounds(10, 20, 104, 14);
		kusovnik.add(lblSloenVrobku);
		
		JComboBox cmbKusSlozeniVyr = new JComboBox();
		cmbKusSlozeniVyr.setBounds(252, 12, 146, 20);
		kusovnik.add(cmbKusSlozeniVyr);
		
		JButton btnKusSlozeniVyr = new JButton("Zobraz");
		btnKusSlozeniVyr.setBounds(435, 11, 89, 23);
		kusovnik.add(btnKusSlozeniVyr);
		
		JLabel lblVrobekObsahujeDanou = new JLabel("V\u00FDrobek obsahuj\u00EDc\u00ED surovinu:");
		lblVrobekObsahujeDanou.setBounds(10, 45, 178, 14);
		kusovnik.add(lblVrobekObsahujeDanou);
		
		JComboBox cmbKusObsahujeSur = new JComboBox();
		cmbKusObsahujeSur.setBounds(252, 42, 146, 20);
		kusovnik.add(cmbKusObsahujeSur);
		
		JButton btnKusObsahujeSur = new JButton("Zobraz");
		btnKusObsahujeSur.setBounds(435, 41, 89, 23);
		kusovnik.add(btnKusObsahujeSur);
	}
}
