package org.techsoft.sklad.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;

import org.techsoft.sklad.model.DataManager;
import org.techsoft.sklad.model.JdbcDataManager;
import org.techsoft.sklad.model.VyrobkyCmbModel;
import org.techsoft.sklad.model.ZamCmbModel;
import org.techsoft.sklad.pojo.Adresy;
import org.techsoft.sklad.pojo.Vyrobky;
import org.techsoft.sklad.pojo.Zamestnanci;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameV extends JFrame {

	private DataManager dataManager = null;
	
	private ZamCmbModel zamCmbModelDel = null;
	private VyrobkyCmbModel vyrCmbModelZak = null;
	
	JComboBox<Zamestnanci> cmbDelOsobCislo;
	JComboBox<Vyrobky> cmbAddVyr;
	
	private JPanel contentPane;
	private JTextField txtAddJmenoZak;
	private JTextField txtAddPrijZak;
	private JTextField txtAddTelZak;
	private JTextField txtAddEmailZak;
	private JTextField txtAddMestoZak;
	private JTextField txtAddPscZak;
	private JTextField txtAddUliceZak;
	private JTextField txtAddRegCis;
	private JTextField txtAddMnozstvi;
	private JTextField txtUpdMnozstvi;
	private JTextField txtAddJmenoZam;
	private JTextField txtAddPrijZam;
	private JTextField txtAddTelZam;
	private JTextField txtAddEmailZam;
	private JTextField txtAddMestoZam;
	private JTextField txtAddPscZam;
	private JTextField txtAddUliceZam;
	private JTextField txtAddOsobCislo;
	private JPasswordField txtAddHesloZam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameV frame = new FrameV();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void updateCmbModels(){
		cmbDelOsobCislo.setModel(new ZamCmbModel(dataManager.getAllZamestnance()));
		cmbAddVyr.setModel(new VyrobkyCmbModel(dataManager.getAllVyrobky()));
	}
	
	/**
	 * Create the frame.
	 */
	public FrameV() {
		dataManager = new JdbcDataManager();
		zamCmbModelDel = new ZamCmbModel(dataManager.getAllZamestnance());
		vyrCmbModelZak = new VyrobkyCmbModel(dataManager.getAllVyrobky());
		
		setTitle("Odd\u011Blen\u00ED v\u00FDroby");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 565, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel nova_zak = new JPanel();
		tabbedPane.addTab("Nov\u00E1 zak\u00E1zka", null, nova_zak, null);
		nova_zak.setLayout(null);
		
		JLabel lblRegistraceZkaznka = new JLabel("Registrace z\u00E1kazn\u00EDka:");
		lblRegistraceZkaznka.setBounds(10, 11, 141, 14);
		nova_zak.add(lblRegistraceZkaznka);
		
		JLabel lblJmno = new JLabel("Jm\u00E9no:");
		lblJmno.setBounds(10, 36, 56, 14);
		nova_zak.add(lblJmno);
		
		JLabel lblPjmen = new JLabel("P\u0159\u00EDjmen\u00ED:");
		lblPjmen.setBounds(10, 61, 56, 14);
		nova_zak.add(lblPjmen);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setBounds(10, 86, 56, 14);
		nova_zak.add(lblTelefon);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 111, 46, 14);
		nova_zak.add(lblEmail);
		
		JLabel lblMsto = new JLabel("M\u011Bsto:");
		lblMsto.setBounds(240, 36, 46, 14);
		nova_zak.add(lblMsto);
		
		JLabel lblPs = new JLabel("PS\u010C:");
		lblPs.setBounds(240, 61, 46, 14);
		nova_zak.add(lblPs);
		
		JLabel lblUlice = new JLabel("Ulice:");
		lblUlice.setBounds(240, 86, 46, 14);
		nova_zak.add(lblUlice);
		
		txtAddJmenoZak = new JTextField();
		txtAddJmenoZak.setBounds(66, 33, 130, 20);
		nova_zak.add(txtAddJmenoZak);
		txtAddJmenoZak.setColumns(10);
		
		txtAddPrijZak = new JTextField();
		txtAddPrijZak.setColumns(10);
		txtAddPrijZak.setBounds(66, 58, 130, 20);
		nova_zak.add(txtAddPrijZak);
		
		txtAddTelZak = new JTextField();
		txtAddTelZak.setColumns(10);
		txtAddTelZak.setBounds(66, 83, 130, 20);
		nova_zak.add(txtAddTelZak);
		
		txtAddEmailZak = new JTextField();
		txtAddEmailZak.setColumns(10);
		txtAddEmailZak.setBounds(66, 108, 130, 20);
		nova_zak.add(txtAddEmailZak);
		
		txtAddMestoZak = new JTextField();
		txtAddMestoZak.setColumns(10);
		txtAddMestoZak.setBounds(296, 33, 130, 20);
		nova_zak.add(txtAddMestoZak);
		
		txtAddPscZak = new JTextField();
		txtAddPscZak.setColumns(10);
		txtAddPscZak.setBounds(296, 58, 130, 20);
		nova_zak.add(txtAddPscZak);
		
		txtAddUliceZak = new JTextField();
		txtAddUliceZak.setColumns(10);
		txtAddUliceZak.setBounds(296, 83, 130, 20);
		nova_zak.add(txtAddUliceZak);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 136, 514, 14);
		nova_zak.add(separator);
		
		JLabel lblZakzka = new JLabel("Registrace zak\u00E1zky:");
		lblZakzka.setBounds(10, 152, 121, 14);
		nova_zak.add(lblZakzka);
		
		JLabel lblNewLabel = new JLabel("Registra\u010Dn\u00ED \u010D\u00EDslo:");
		lblNewLabel.setBounds(10, 177, 104, 14);
		nova_zak.add(lblNewLabel);
		
		JLabel lblVrobek = new JLabel("V\u00FDrobek:");
		lblVrobek.setBounds(10, 202, 86, 14);
		nova_zak.add(lblVrobek);
		
		JLabel lblBarva = new JLabel("Barva:");
		lblBarva.setBounds(10, 227, 46, 14);
		nova_zak.add(lblBarva);
		
		JLabel lblMnostv = new JLabel("Mno\u017Estv\u00ED:");
		lblMnostv.setBounds(10, 252, 74, 14);
		nova_zak.add(lblMnostv);
		
		txtAddRegCis = new JTextField();
		txtAddRegCis.setBounds(114, 174, 130, 20);
		nova_zak.add(txtAddRegCis);
		txtAddRegCis.setColumns(10);
		//TODO
		cmbAddVyr = new JComboBox<>(vyrCmbModelZak);
		cmbAddVyr.setBounds(114, 199, 130, 20);
		nova_zak.add(cmbAddVyr);
		//TODO
		JComboBox cmbAddBarva = new JComboBox();
		cmbAddBarva.setBounds(114, 224, 130, 20);
		nova_zak.add(cmbAddBarva);
		
		txtAddMnozstvi = new JTextField();
		txtAddMnozstvi.setBounds(114, 249, 86, 20);
		nova_zak.add(txtAddMnozstvi);
		txtAddMnozstvi.setColumns(10);
		
		JButton btnRegistrovat = new JButton("Registrovat");
		btnRegistrovat.setBounds(114, 280, 104, 23);
		nova_zak.add(btnRegistrovat);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 314, 514, 14);
		nova_zak.add(separator_2);
		
		JLabel lblOdstrannZakzky = new JLabel("Odebrat zak\u00E1zku:");
		lblOdstrannZakzky.setBounds(10, 326, 156, 14);
		nova_zak.add(lblOdstrannZakzky);
		
		JLabel label_7 = new JLabel("Registra\u010Dn\u00ED \u010D\u00EDslo:");
		label_7.setBounds(10, 351, 104, 14);
		nova_zak.add(label_7);
		
		JComboBox txtDelRegCis = new JComboBox();
		txtDelRegCis.setBounds(114, 348, 130, 20);
		nova_zak.add(txtDelRegCis);
		
		JButton btnDelZakazka = new JButton("Odebrat");
		btnDelZakazka.setBounds(114, 379, 89, 23);
		nova_zak.add(btnDelZakazka);
		
		JLabel lblZamstnanec = new JLabel("Zam\u011Bstnanec:");
		lblZamstnanec.setBounds(264, 177, 86, 14);
		nova_zak.add(lblZamstnanec);
		
		JComboBox cmbAddZam = new JComboBox();
		cmbAddZam.setBounds(351, 174, 130, 20);
		nova_zak.add(cmbAddZam);
		
		JPanel obsah_zak = new JPanel();
		tabbedPane.addTab("Obsah zak\u00E1zky", null, obsah_zak, null);
		obsah_zak.setLayout(null);
		
		JLabel label = new JLabel("Registra\u010Dn\u00ED \u010D\u00EDslo:");
		label.setBounds(10, 36, 105, 14);
		obsah_zak.add(label);
		
		JLabel lblPiazenVceVrobk = new JLabel("P\u0159i\u0159azen\u00ED v\u00EDce v\u00FDrobk\u016F:");
		lblPiazenVceVrobk.setBounds(10, 11, 156, 14);
		obsah_zak.add(lblPiazenVceVrobk);
		
		JLabel label_2 = new JLabel("V\u00FDrobek:");
		label_2.setBounds(10, 61, 63, 14);
		obsah_zak.add(label_2);
		
		JComboBox cmbRegVyr = new JComboBox();
		cmbRegVyr.setBounds(114, 58, 130, 20);
		obsah_zak.add(cmbRegVyr);
		
		JComboBox cmbUpdBarva = new JComboBox();
		cmbUpdBarva.setBounds(114, 83, 130, 20);
		obsah_zak.add(cmbUpdBarva);
		
		JLabel label_3 = new JLabel("Barva:");
		label_3.setBounds(10, 86, 46, 14);
		obsah_zak.add(label_3);
		
		JLabel label_4 = new JLabel("Mno\u017Estv\u00ED:");
		label_4.setBounds(10, 111, 75, 14);
		obsah_zak.add(label_4);
		
		txtUpdMnozstvi = new JTextField();
		txtUpdMnozstvi.setColumns(10);
		txtUpdMnozstvi.setBounds(114, 108, 86, 20);
		obsah_zak.add(txtUpdMnozstvi);
		
		JButton btnPridatVyr = new JButton("P\u0159idat");
		btnPridatVyr.setBounds(114, 139, 89, 23);
		obsah_zak.add(btnPridatVyr);
		
		JComboBox cmbUpdRegCis = new JComboBox();
		cmbUpdRegCis.setBounds(114, 33, 130, 20);
		obsah_zak.add(cmbUpdRegCis);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 173, 514, 14);
		obsah_zak.add(separator_1);
		
		JLabel lblOdebrnVrobkuOd = new JLabel("Odebr\u00E1n\u00ED v\u00FDrobku od zak\u00E1zky:");
		lblOdebrnVrobkuOd.setBounds(10, 192, 190, 14);
		obsah_zak.add(lblOdebrnVrobkuOd);
		
		JLabel label_5 = new JLabel("Registra\u010Dn\u00ED \u010D\u00EDslo:");
		label_5.setBounds(10, 217, 105, 14);
		obsah_zak.add(label_5);
		
		JComboBox cmbDelRegCis = new JComboBox();
		cmbDelRegCis.setBounds(114, 214, 130, 20);
		obsah_zak.add(cmbDelRegCis);
		
		JLabel label_6 = new JLabel("V\u00FDrobek:");
		label_6.setBounds(10, 242, 63, 14);
		obsah_zak.add(label_6);
		
		JComboBox cmbDelVyr = new JComboBox();
		cmbDelVyr.setBounds(114, 239, 130, 20);
		obsah_zak.add(cmbDelVyr);
		
		JButton btnOdebrat = new JButton("Odebrat");
		btnOdebrat.setBounds(114, 270, 89, 23);
		obsah_zak.add(btnOdebrat);
		
		JLabel lblPotvrzenHotovZakzky = new JLabel("Potvrzen\u00ED hotov\u00E9 zak\u00E1zky:");
		lblPotvrzenHotovZakzky.setBounds(290, 8, 169, 14);
		obsah_zak.add(lblPotvrzenHotovZakzky);
		
		JLabel label_15 = new JLabel("Registra\u010Dn\u00ED \u010D\u00EDslo:");
		label_15.setBounds(290, 33, 105, 14);
		obsah_zak.add(label_15);
		
		JComboBox cmbPotvrditRegCis = new JComboBox();
		cmbPotvrditRegCis.setBounds(394, 30, 130, 20);
		obsah_zak.add(cmbPotvrditRegCis);
		
		JButton btnPotvrdit = new JButton("Potvrdit");
		btnPotvrdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPotvrdit.setBounds(394, 60, 89, 23);
		obsah_zak.add(btnPotvrdit);
		
		JPanel sprava_zam = new JPanel();
		tabbedPane.addTab("Spr\u00E1va zam\u011Bstnanc\u016F", null, sprava_zam, null);
		sprava_zam.setLayout(null);
		
		JLabel lblRegistraceZamstnance = new JLabel("Registrace zam\u011Bstnance:");
		lblRegistraceZamstnance.setBounds(10, 11, 159, 14);
		sprava_zam.add(lblRegistraceZamstnance);
		
		JLabel label_8 = new JLabel("Jm\u00E9no:");
		label_8.setBounds(10, 61, 57, 14);
		sprava_zam.add(label_8);
		
		txtAddJmenoZam = new JTextField();
		txtAddJmenoZam.setColumns(10);
		txtAddJmenoZam.setBounds(66, 58, 130, 20);
		sprava_zam.add(txtAddJmenoZam);
		
		JLabel label_9 = new JLabel("P\u0159\u00EDjmen\u00ED:");
		label_9.setBounds(10, 86, 57, 14);
		sprava_zam.add(label_9);
		
		txtAddPrijZam = new JTextField();
		txtAddPrijZam.setColumns(10);
		txtAddPrijZam.setBounds(66, 83, 130, 20);
		sprava_zam.add(txtAddPrijZam);
		
		JLabel label_10 = new JLabel("Telefon:");
		label_10.setBounds(10, 111, 57, 14);
		sprava_zam.add(label_10);
		
		txtAddTelZam = new JTextField();
		txtAddTelZam.setColumns(10);
		txtAddTelZam.setBounds(66, 108, 130, 20);
		sprava_zam.add(txtAddTelZam);
		
		JLabel label_11 = new JLabel("Email:");
		label_11.setBounds(10, 136, 46, 14);
		sprava_zam.add(label_11);
		
		txtAddEmailZam = new JTextField();
		txtAddEmailZam.setColumns(10);
		txtAddEmailZam.setBounds(66, 133, 130, 20);
		sprava_zam.add(txtAddEmailZam);
		
		txtAddMestoZam = new JTextField();
		txtAddMestoZam.setColumns(10);
		txtAddMestoZam.setBounds(296, 33, 130, 20);
		sprava_zam.add(txtAddMestoZam);
		
		txtAddPscZam = new JTextField();
		txtAddPscZam.setColumns(10);
		txtAddPscZam.setBounds(296, 58, 130, 20);
		sprava_zam.add(txtAddPscZam);
		
		JLabel label_12 = new JLabel("PS\u010C:");
		label_12.setBounds(240, 61, 46, 14);
		sprava_zam.add(label_12);
		
		JLabel label_13 = new JLabel("M\u011Bsto:");
		label_13.setBounds(240, 36, 46, 14);
		sprava_zam.add(label_13);
		
		JLabel label_14 = new JLabel("Ulice:");
		label_14.setBounds(240, 86, 46, 14);
		sprava_zam.add(label_14);
		
		txtAddUliceZam = new JTextField();
		txtAddUliceZam.setColumns(10);
		txtAddUliceZam.setBounds(296, 83, 130, 20);
		sprava_zam.add(txtAddUliceZam);
		
		JLabel label_heslo = new JLabel("Heslo:");
		label_heslo.setBounds(240, 111, 46, 14);
		sprava_zam.add(label_heslo);
		
		txtAddHesloZam = new JPasswordField();
		txtAddHesloZam.setColumns(10);
		txtAddHesloZam.setBounds(296, 111, 130, 20);
		sprava_zam.add(txtAddHesloZam);
			
		JLabel lblOsobnslo = new JLabel("Osobn\u00ED \u010D\u00EDslo:");
		lblOsobnslo.setBounds(10, 36, 90, 14);
		sprava_zam.add(lblOsobnslo);
		
		txtAddOsobCislo = new JTextField();
		txtAddOsobCislo.setColumns(10);
		txtAddOsobCislo.setBounds(110, 33, 86, 20);
		sprava_zam.add(txtAddOsobCislo);
		
		JCheckBox chckbxAdmin = new JCheckBox("Admin práva");
		chckbxAdmin.setBounds(296, 136, 130, 20);
		sprava_zam.add(chckbxAdmin);
		
		JButton btnPridatZam = new JButton("P\u0159idat");
		btnPridatZam.setBounds(337, 161, 89, 23);
		btnPridatZam.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent paramActionEvent) {
				if(txtAddMestoZam.getText().equals("") || txtAddPscZam.getText().equals("") ||
						txtAddUliceZam.getText().equals("") ||
						txtAddJmenoZam.getText().equals("") || txtAddPrijZam.getText().equals("") ||
						txtAddEmailZam.getText().equals("") || txtAddTelZam.getText().equals("") ||
						txtAddOsobCislo.getText().equals("") ){
					JOptionPane.showMessageDialog(tabbedPane, "Všechna pole musí být vyplnìna", "Nezadané hodnoty" , JOptionPane.ERROR_MESSAGE);
				}else{
				Adresy adr = new Adresy(txtAddMestoZam.getText(), txtAddPscZam.getText(),
						txtAddUliceZam.getText());
				Zamestnanci zam = new Zamestnanci(txtAddJmenoZam.getText(), txtAddPrijZam.getText(),
						txtAddEmailZam.getText(), txtAddTelZam.getText(), 0, Integer.parseInt(txtAddOsobCislo.getText()),
						txtAddHesloZam.getPassword(), chckbxAdmin.isSelected());
				dataManager.addZamestnance(zam, adr);
				txtAddMestoZam.setText("");
				txtAddPscZam.setText("");
				txtAddUliceZam.setText("");
				txtAddJmenoZam.setText("");
				txtAddPrijZam.setText("");
				txtAddEmailZam.setText("");
				txtAddTelZam.setText("");
				txtAddOsobCislo.setText(null);
				txtAddHesloZam.setText(null);
				updateCmbModels();
				}
			}
		});
		sprava_zam.add(btnPridatZam);
		
		JLabel lblOdebratZamstnance = new JLabel("Odebrat zam\u011Bstnance:");
		lblOdebratZamstnance.setBounds(10, 191, 159, 14);
		sprava_zam.add(lblOdebratZamstnance);
		
		JLabel label_16 = new JLabel("Osobn\u00ED \u010D\u00EDslo:");
		label_16.setBounds(10, 216, 90, 14);
		sprava_zam.add(label_16);
		
		cmbDelOsobCislo = new JComboBox<>(zamCmbModelDel);
		cmbDelOsobCislo.setBounds(110, 216, 186, 20);
		sprava_zam.add(cmbDelOsobCislo);
		
		JButton btnOdebratZam = new JButton("Odebrat");
		btnOdebratZam.setBounds(110, 247, 89, 23);
		btnOdebratZam.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent paramActionEvent) {
				// TODO Auto-generated method stub
				Zamestnanci zam = cmbDelOsobCislo.getModel().getElementAt(cmbDelOsobCislo.getSelectedIndex());
				dataManager.delZamestnance(zam);
				cmbDelOsobCislo.setSelectedIndex(-1);
				updateCmbModels();
			}
		});
		sprava_zam.add(btnOdebratZam);
	}
}
