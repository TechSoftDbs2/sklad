package org.techsoft.sklad.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

import org.techsoft.sklad.model.DataManager;
import org.techsoft.sklad.model.DruhySurovinComboBoxModel;
import org.techsoft.sklad.model.DruhyVyrobkuComboBoxModel;
import org.techsoft.sklad.model.JdbcDataManager;
import org.techsoft.sklad.model.SurovinyByVyrTableModel;
import org.techsoft.sklad.model.SurovinyCmbModel;
import org.techsoft.sklad.model.SurovinyTableModel;
import org.techsoft.sklad.model.VyrobkyByIdDsurTableModel;
import org.techsoft.sklad.model.VyrobkyCmbModel;
import org.techsoft.sklad.model.VyrobkyTableModel;
import org.techsoft.sklad.pojo.DruhySurovin;
import org.techsoft.sklad.pojo.DruhyVyrobku;
import org.techsoft.sklad.pojo.Suroviny;
import org.techsoft.sklad.pojo.SurovinyVyrobku;
import org.techsoft.sklad.pojo.Vyrobky;

public class FrameS extends JFrame {
	private static final long serialVersionUID = 6194547247302130567L;

	private int indexSur;
	private int indexVyr;
	
	private DataManager dataManager = null;
	
	private SurovinyCmbModel sCmbModelUpd = null;
	private SurovinyCmbModel sCmbModelAddSch = null;
	private SurovinyCmbModel sCmbModelDelSch = null;
	private SurovinyCmbModel sCmbModelDel = null;
	
	
	private DruhySurovinComboBoxModel dsCmbModelDel = null;
	private DruhySurovinComboBoxModel dsCmbModelUpd = null;
	private DruhySurovinComboBoxModel dsCmbModelNew = null;
	private DruhySurovinComboBoxModel dsCmbModelStav = null;
	
	private DruhyVyrobkuComboBoxModel dvCmbModelDel= null;
	private DruhyVyrobkuComboBoxModel dvCmbModelUpd= null;
	private DruhyVyrobkuComboBoxModel dvCmbModelAdd= null;
	
	private VyrobkyCmbModel vCmbModelAddSch = null;
	private VyrobkyCmbModel vCmbModelDelSch = null;
	private VyrobkyCmbModel vCmbModelUpd = null;
	private VyrobkyCmbModel vCmbModelDel = null;
	private VyrobkyCmbModel vCmbModelKusSlozeniVyr = null;
	
	
	
	
	private JPanel contentPane;
	
	JComboBox<DruhySurovin> cmbAddDruhSur;
	JComboBox<DruhySurovin> cmbDelDruhSur;
	JComboBox<DruhySurovin> cmbUpdDruhSur;
	JComboBox<DruhySurovin> cmbKusObsahujeSur;	
	
	JComboBox<Suroviny> cmbUpdSurNaz; 
	JComboBox<Suroviny> cmbDelSur;
	JComboBox<Suroviny> cmbAddSchemaSur;
	JComboBox<Suroviny> cmbDelSchemaSur;
	JComboBox<Suroviny> cmbNazevSur;
	
	
	JComboBox<DruhyVyrobku> cmbAddDruhVyr;
	JComboBox<DruhyVyrobku> cmbDelDruhVyr;
	JComboBox<DruhyVyrobku> cmbUpdDruh;
	
	JComboBox<Vyrobky> cmbDelVyr;
	JComboBox<Vyrobky> cmbUpdSeri;
	JComboBox<Vyrobky> cmbAddSchemaVyr;
	JComboBox<Vyrobky> cmbDelSchemaVyr;
	JComboBox<Vyrobky> cmbKusSlozeniVyr;
	
	
	
	
	private JTextField txsAddNazevSur;
	private JTextField txsAddKusy;
	private JTextField txsAddVaha;
	private JTextField txsAddMat;
	private JTextField txsUpdKusy;
	private JTextField txsUpdVaha;
	private JTextField txsAddDruh;
	
	private JTextField txvAddSeri;
	private JTextField txvAddNazevVyr;
	private JTextField txvAddSirka;
	private JTextField txvAddVyska;
	private JTextField txvAddHloubka;
	private JTextField txvAddDruh;
	private JTextField txvUpdNazev;
	private JTextField txvUpdSirka;
	private JTextField txvUpdVyska;
	private JTextField txvUpdHloubka;
	
	private JTextField txsUpdMat;
	private JTextField txtAddKus;
	
	JTabbedPane tabbedPane;
	
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
	
	public void updateCmbModels(){
		cmbDelSur.setModel(new SurovinyCmbModel(dataManager.getAllSuroviny()));
		cmbUpdSurNaz.setModel(new SurovinyCmbModel(dataManager.getAllSuroviny()));
		cmbAddSchemaSur.setModel(new SurovinyCmbModel(dataManager.getAllSuroviny()));
		//cmbNazevSur.setModel(new SurovinyCmbModel(dataManager.getAllSuroviny()));
		
		cmbAddDruhSur.setModel(new DruhySurovinComboBoxModel(dataManager.getAllDruhySurovin()));
		cmbDelDruhSur.setModel(new DruhySurovinComboBoxModel(dataManager.getAllDruhySurovin()));
		cmbUpdDruhSur.setModel(new DruhySurovinComboBoxModel(dataManager.getAllDruhySurovin()));
		
		cmbAddSchemaSur.setModel(new SurovinyCmbModel(dataManager.getAllSuroviny()));
		cmbAddSchemaVyr.setModel(new VyrobkyCmbModel(dataManager.getAllVyrobky()));
		cmbDelSchemaVyr.setModel(new VyrobkyCmbModel(dataManager.getAllVyrobky()));
		
		cmbAddDruhVyr.setModel(new DruhyVyrobkuComboBoxModel(dataManager.getAllDruhyVyrobku()));
		cmbDelDruhVyr.setModel(new DruhyVyrobkuComboBoxModel(dataManager.getAllDruhyVyrobku()));
		cmbUpdDruh.setModel(new DruhyVyrobkuComboBoxModel(dataManager.getAllDruhyVyrobku()));
		cmbKusObsahujeSur.setModel(new DruhySurovinComboBoxModel(dataManager.getAllDruhySurovin()));
		
		cmbDelVyr.setModel(new VyrobkyCmbModel(dataManager.getAllVyrobky()));
		cmbUpdSeri.setModel(new VyrobkyCmbModel(dataManager.getAllVyrobky()));
		cmbKusSlozeniVyr.setModel(new VyrobkyCmbModel(dataManager.getAllVyrobky()));
	}
	/**
	 * Create the frame.
	 */
	public FrameS() {
		//TODO
		dataManager = new JdbcDataManager();
		dsCmbModelDel = new DruhySurovinComboBoxModel(dataManager.getAllDruhySurovin());
		dsCmbModelUpd = new DruhySurovinComboBoxModel(dataManager.getAllDruhySurovin());
		dsCmbModelNew = new DruhySurovinComboBoxModel(dataManager.getAllDruhySurovin());
		sCmbModelUpd  = new SurovinyCmbModel(dataManager.getAllSuroviny());
		sCmbModelDel  = new SurovinyCmbModel(dataManager.getAllSuroviny());
		sCmbModelAddSch = new SurovinyCmbModel(dataManager.getAllSuroviny());
		vCmbModelAddSch = new VyrobkyCmbModel(dataManager.getAllVyrobky());
		
		dsCmbModelStav = new DruhySurovinComboBoxModel(dataManager.getAllDruhySurovin());
		dvCmbModelAdd = new DruhyVyrobkuComboBoxModel(dataManager.getAllDruhyVyrobku());
		dvCmbModelDel = new DruhyVyrobkuComboBoxModel(dataManager.getAllDruhyVyrobku());
		dvCmbModelUpd = new DruhyVyrobkuComboBoxModel(dataManager.getAllDruhyVyrobku());
		vCmbModelDel = new VyrobkyCmbModel(dataManager.getAllVyrobky());
		vCmbModelKusSlozeniVyr = new VyrobkyCmbModel(dataManager.getAllVyrobky());
		vCmbModelDelSch = new VyrobkyCmbModel(dataManager.getAllVyrobky());
		vCmbModelUpd = new VyrobkyCmbModel(dataManager.getAllVyrobky());
		
		setTitle("Sklad surovin a polotovar\u016F");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 565, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
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
		btnAddSur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cmbAddDruhSur.getSelectedIndex();
				if (txsAddNazevSur.getText().equals("") ||  txsAddKusy.getText().equals("") ||
						txsAddMat.getText().equals("") || txsAddVaha.getText().equals("") || index == -1)
				{
					System.out.println("neni vyplneno");
					JOptionPane.showMessageDialog(tabbedPane, "Všechna pole musí být vyplnìna", "Nezadané hodnoty" , JOptionPane.ERROR_MESSAGE);
					
				} else {	
					int  idS = cmbAddDruhSur.getModel().getElementAt(index).getId();
					Suroviny s = new Suroviny(txsAddNazevSur.getText(), Integer.parseInt(txsAddKusy.getText()), txsAddMat.getText(), Integer.parseInt(txsAddVaha.getText()), idS);
					dataManager.addSurovinu(s, idS);
					txsAddNazevSur.setText(null);
					txsAddKusy.setText(null);
					txsAddMat.setText(null);
					txsAddVaha.setText(null);
					cmbAddDruhSur.setSelectedIndex(-1);
					updateCmbModels();			
				}
			}
		});
		
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
		btnAddDruh.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txsAddDruh.getText().equals("")) {
					JOptionPane.showMessageDialog(tabbedPane, "Vsechna pole musi byt vyplnena", "Nezadane hodnoty" , JOptionPane.ERROR_MESSAGE);

				}else{
					DruhySurovin dS = new DruhySurovin(txsAddDruh.getText());
					dataManager.addDruhSuroviny(dS);
					txsAddDruh.setText(null);
					updateCmbModels();
				}		
			}
		});
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
		btnUpdSur.setEnabled(false);
		btnUpdSur.setBounds(124, 386, 89, 23);
		btnUpdSur.addActionListener( new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent paramActionEvent) {
				if (txsUpdKusy.getText().equals("") || txsUpdKusy.getText().equals("") ||
				txsUpdKusy.getText().equals("") || cmbUpdDruhSur.getSelectedIndex()==-1 ||
				cmbUpdSurNaz.getEditor().getItem().toString().equals("")){
					JOptionPane.showMessageDialog(tabbedPane, "Vsechna pole musi byt vyplnena", "Nezadane hodnoty" , JOptionPane.ERROR_MESSAGE);
				}else
				{
				Suroviny s = new Suroviny(indexSur, cmbUpdSurNaz.getEditor().getItem().toString(),
						Integer.parseInt(txsUpdKusy.getText()), txsUpdMat.getText(),
						Integer.parseInt(txsUpdVaha.getText()), 
						cmbUpdDruhSur.getItemAt(cmbUpdDruhSur.getSelectedIndex()).getId());
				dataManager.updSurovinu(s);
				cmbUpdSurNaz.setEditable(false);
				
				cmbUpdDruhSur.setSelectedIndex(-1);
				cmbUpdDruhSur.setEnabled(false);
				txsUpdKusy.setText(null);
				txsUpdMat.setText(null);
				txsUpdVaha.setText(null);
				updateCmbModels();
				btnUpdSur.setEnabled(false);
				}
			}
		});
		suroviny.add(btnUpdSur);
		
		JLabel lblOdebratSurovinu_1 = new JLabel("Odebrat surovinu:");
		lblOdebratSurovinu_1.setBounds(268, 230, 178, 14);
		suroviny.add(lblOdebratSurovinu_1);
		
		JLabel label_3 = new JLabel("N\u00E1zev:");
		label_3.setBounds(10, 255, 46, 14);
		suroviny.add(label_3);
		
		
		cmbUpdSurNaz = new JComboBox<>(sCmbModelUpd);
		cmbUpdSurNaz.setBounds(91, 255, 162, 20);
		cmbUpdSurNaz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent paramActionEvent) {
				cmbUpdSurNaz.setEditable(true);				
				cmbUpdDruhSur.setEnabled(true);
				int index = cmbUpdSurNaz.getSelectedIndex();
				if(index!=-1){
				Suroviny s = cmbUpdSurNaz.getModel().getElementAt(index);
				indexSur = s.getId();
				cmbUpdSurNaz.setSelectedItem(s.getNazev());
				List<DruhySurovin> lDS = dataManager.getAllDruhySurovin();
				
				for (int i = 0; i < lDS.size(); i++) {
					if(s.getIdDruhuSur() == lDS.get(i).getId())
						cmbUpdDruhSur.setSelectedIndex(i);
				}	
				
				txsUpdMat.setText(s.getMaterial());
				txsUpdKusy.setText(Integer.toString(s.getKusy()));
				txsUpdVaha.setText(Integer.toString(s.getVaha()));
				btnUpdSur.setEnabled(true);
				}
			}
		});
		suroviny.add(cmbUpdSurNaz);
		
		JButton btnDelSur = new JButton("Odebrat");
		btnDelSur.setBounds(391, 285, 89, 23);
		btnDelSur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cmbDelSur.getSelectedIndex();
				if(index != -1){
				Suroviny s = cmbDelSur.getModel().getElementAt(index);
				dataManager.delSurvinu(s);
				updateCmbModels();
				JOptionPane.showMessageDialog(tabbedPane, "Surovina úspìšnì smazána!", "Úspìch", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(tabbedPane, "Nejdøíve vyberte surovinu!", "Chyba",JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
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
		
		cmbDelDruhSur = new JComboBox<>(dsCmbModelDel);
		cmbDelDruhSur.setBounds(358, 137, 122, 20);
		suroviny.add(cmbDelDruhSur);
		
		JButton btnDelDruhSur = new JButton("Odebrat");
		btnDelDruhSur.setBounds(391, 168, 89, 23);
		btnDelDruhSur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent paramActionEvent) {
				int index = cmbDelDruhSur.getSelectedIndex();
				if (index != -1){
				DruhySurovin dS = cmbDelDruhSur.getModel().getElementAt(index);
				dataManager.delDruhSuroviny(dS);
				updateCmbModels();
				JOptionPane.showMessageDialog(tabbedPane, "Druh suroviny úspìšnì smazána!", "Úspìch", JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(tabbedPane, "Nejdøíve vyberte druh suroviny!", "Chyba",JOptionPane.ERROR_MESSAGE);
			}				
			}
		});
		suroviny.add(btnDelDruhSur);
		
		JLabel lblDruh = new JLabel("Druh:");
		lblDruh.setBounds(10, 280, 46, 14);
		suroviny.add(lblDruh);
		
		JLabel lblNewLabel_2 = new JLabel("Materi\u00E1l:");
		lblNewLabel_2.setBounds(10, 305, 71, 14);
		suroviny.add(lblNewLabel_2);
		
		cmbUpdDruhSur = new JComboBox<>(dsCmbModelUpd);
		cmbUpdDruhSur.setBounds(91, 280, 122, 20);
		cmbUpdDruhSur.setEnabled(false);
		suroviny.add(cmbUpdDruhSur);
		
		txsUpdMat = new JTextField();
		txsUpdMat.setBounds(91, 305, 122, 20);
		suroviny.add(txsUpdMat);
		txsUpdMat.setColumns(10);
		
		cmbAddDruhSur = new JComboBox<>(dsCmbModelNew);
		cmbAddDruhSur.setBounds(91, 65, 122, 20);
		suroviny.add(cmbAddDruhSur);
		
		cmbDelSur = new JComboBox<Suroviny>(sCmbModelDel);
		cmbDelSur.setBounds(358, 254, 162, 20);
		suroviny.add(cmbDelSur);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(238, 10, 7, 195);
		suroviny.add(separator_3);
		
		//////**-*-*-*-*-*-výrobky-*-*-*-*-**//////
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
		btnAddVyr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cmbAddDruhVyr.getSelectedIndex();
				if (txvAddNazevVyr.getText().equals("") ||  txvAddSeri.getText().equals("") ||
						txvAddVyska.getText().equals("") || txvAddSirka.getText().equals("") ||
						txvAddHloubka.getText().equals("") || index == -1)
				{
					JOptionPane.showMessageDialog(tabbedPane, "Všechna pole musí být vyplnìna", "Nezadané hodnoty" , JOptionPane.ERROR_MESSAGE);
					
				} else {
					Vyrobky v = new Vyrobky(Integer.parseInt(txvAddSeri.getText()),
							Integer.parseInt(txvAddHloubka.getText()), txvAddNazevVyr.getText(),
							Integer.parseInt(txvAddSirka.getText()), Integer.parseInt(txvAddVyska.getText()),
							cmbAddDruhVyr.getModel().getElementAt(index).getId());
					dataManager.addVyrobek(v);
					txvAddNazevVyr.setText(null);
					txvAddSeri.setText(null);
					txvAddVyska.setText(null);
					txvAddSirka.setText(null);
					txvAddHloubka.setText(null);
					cmbAddDruhVyr.setSelectedIndex(-1);
					updateCmbModels();
				}				
			}
		});
		vyrobky.add(btnAddVyr);
		
		JLabel lblPidatDruhVrobku = new JLabel("P\u0159idat druh v\u00FDrobku: ");
		lblPidatDruhVrobku.setBounds(268, 11, 178, 14);
		vyrobky.add(lblPidatDruhVrobku);
		
		JLabel lblDruh_1 = new JLabel("Použití:");
		lblDruh_1.setBounds(10, 90, 46, 14);
		vyrobky.add(lblDruh_1);
		
		JButton btnAddDruhVyr = new JButton("P\u0159idat");
		btnAddDruhVyr.setBounds(391, 71, 89, 23);
		btnAddDruhVyr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txvAddDruh.getText().equals("")) {
					JOptionPane.showMessageDialog(tabbedPane, "Všechna pole musí být vyplnìna", "Nezadané hodnoty" , JOptionPane.ERROR_MESSAGE);
				}else{
					DruhyVyrobku dV = new DruhyVyrobku(txvAddDruh.getText());
					dataManager.addDruhVyrobku(dV);
					txvAddDruh.setText(null);
					updateCmbModels();
				}			
			}
		});
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
		btnDelVyr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cmbDelVyr.getSelectedIndex();
				if(index != -1){
				Vyrobky v = cmbDelVyr.getModel().getElementAt(index);
				dataManager.delVyrobek(v);
				updateCmbModels();
				JOptionPane.showMessageDialog(tabbedPane, "Výrobek úspìšnì smazán!", "Úspìch", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(tabbedPane, "Nejdøíve vyberte výrobek, který chcete smazat!", "Chyba",JOptionPane.ERROR_MESSAGE);
				}						
			}
		});
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
		btnUpdVyr.setEnabled(false);
		btnUpdVyr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txvUpdNazev.getText().equals("") || txvUpdHloubka.getText().equals("") ||
						txvUpdSirka.getText().equals("") || txvUpdVyska.getText().equals("") ||
						cmbUpdDruh.getSelectedIndex()==-1 || cmbUpdSeri.getEditor().getItem().toString().equals("")){
					JOptionPane.showMessageDialog(tabbedPane, "Vsechna pole musi byt vyplnena", "Nezadane hodnoty" , JOptionPane.ERROR_MESSAGE);
				}else{
				Vyrobky v = new Vyrobky(indexVyr, Integer.parseInt(cmbUpdSeri.getEditor().getItem().toString()),
						Integer.parseInt(txvUpdHloubka.getText()), txvUpdNazev.getText(),
						Integer.parseInt(txvUpdSirka.getText()),Integer.parseInt(txvUpdVyska.getText()), 
						cmbUpdDruh.getItemAt(cmbUpdDruh.getSelectedIndex()).getId());
				dataManager.updVyrobek(v);
				cmbUpdSeri.setEditable(false);
				
				cmbUpdDruh.setSelectedIndex(-1);
				cmbUpdDruh.setEnabled(false);
				txvUpdNazev.setText(null);
				txvUpdHloubka.setText(null);
				txvUpdSirka.setText(null);
				txvUpdVyska.setText(null);
				updateCmbModels();
				btnUpdVyr.setEnabled(false);
				}
			}
		});
		vyrobky.add(btnUpdVyr);	
		cmbAddDruhVyr = new JComboBox<>(dvCmbModelAdd);
		cmbAddDruhVyr.setBounds(91, 90, 122, 20);
		vyrobky.add(cmbAddDruhVyr);
		
		JLabel lblNzev_4 = new JLabel("Odebrat druh v\u00FDrobku:");
		lblNzev_4.setBounds(268, 115, 142, 14);
		vyrobky.add(lblNzev_4);
		
		JLabel lblNzev_5 = new JLabel("N\u00E1zev:");
		lblNzev_5.setBounds(268, 143, 46, 14);
		vyrobky.add(lblNzev_5);
		
		cmbDelDruhVyr = new JComboBox<>(dvCmbModelDel);
		cmbDelDruhVyr.setBounds(358, 140, 122, 20);
		vyrobky.add(cmbDelDruhVyr);

		cmbUpdSeri = new JComboBox<>(vCmbModelUpd);
		cmbUpdSeri.setBounds(91, 264, 122, 20);
		cmbUpdSeri.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cmbUpdSeri.setEditable(true);				
				cmbUpdDruh.setEnabled(true);
				int index = cmbUpdSeri.getSelectedIndex();			
				Vyrobky v = cmbUpdSeri.getModel().getElementAt(index);
				indexVyr = v.getId();
				cmbUpdSeri.setSelectedItem(v.getSerioveCislo());
				List<DruhyVyrobku> lDV = dataManager.getAllDruhyVyrobku();
				txvUpdNazev.setText(v.getNazev());
				
				for (int i = 0; i < lDV.size(); i++) {
					if(v.getIdDruhyvyrobku() == lDV.get(i).getId())
						cmbUpdDruh.setSelectedIndex(i);
				}	
				
				txvUpdVyska.setText(Integer.toString(v.getVyska()));
				txvUpdSirka.setText(Integer.toString(v.getSirka()));
				txvUpdHloubka.setText(Integer.toString(v.getHloubka()));
				btnUpdVyr.setEnabled(true);
			}
		});
		vyrobky.add(cmbUpdSeri);
		
		cmbDelVyr = new JComboBox<>(vCmbModelDel);
		cmbDelVyr.setBounds(358, 264, 122, 20);
		vyrobky.add(cmbDelVyr);
		
		JLabel lblDruh_2 = new JLabel("Použití:");
		lblDruh_2.setBounds(10, 314, 46, 14);
		vyrobky.add(lblDruh_2);
		
		cmbUpdDruh = new JComboBox<>(dvCmbModelUpd);
		cmbUpdDruh.setBounds(91, 314, 122, 20);
		cmbUpdDruh.setEnabled(false);
		vyrobky.add(cmbUpdDruh);
		JButton btnDelDruhVyr = new JButton("Odebrat");
		btnDelDruhVyr.setBounds(391, 170, 89, 23);
		btnDelDruhVyr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = cmbDelDruhVyr.getSelectedIndex();
				if (index != -1){
				DruhyVyrobku dV = cmbDelDruhVyr.getModel().getElementAt(index);
				dataManager.delDruhVyrobku(dV);
				updateCmbModels();
				JOptionPane.showMessageDialog(tabbedPane, "Druh výrobku úspìšnì smazán!", "Úspìch", JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(tabbedPane, "Nejdøíve vyberte druh výrobku, který chcete smazat!", "Chyba",JOptionPane.ERROR_MESSAGE);
			}				
			}
		});
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
		
		cmbAddSchemaSur = new JComboBox<>(sCmbModelAddSch);
		cmbAddSchemaSur.setBounds(91, 65, 122, 20);
		schema.add(cmbAddSchemaSur);
		
		cmbAddSchemaVyr = new JComboBox<>(vCmbModelAddSch);
		cmbAddSchemaVyr.setBounds(91, 40, 122, 20);
		schema.add(cmbAddSchemaVyr);
		
		JButton btnAddSchema = new JButton("P\u0159idat");
		btnAddSchema.setBounds(124, 121, 89, 23);
		btnAddSchema.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO
				if(txtAddKus.getText().equals("") || cmbAddSchemaSur.getSelectedIndex()==-1||
						cmbAddSchemaVyr.getSelectedIndex()==-1){
					JOptionPane.showMessageDialog(tabbedPane, "Všechna pole musí být vyplnìna", "Nezadané hodnoty" , JOptionPane.ERROR_MESSAGE);
				}else{
					SurovinyVyrobku sV = new SurovinyVyrobku(cmbAddSchemaSur.getModel().getElementAt(cmbAddSchemaSur.getSelectedIndex()).getId(),
							cmbAddSchemaVyr.getModel().getElementAt(cmbAddSchemaVyr.getSelectedIndex()).getId(), Integer.parseInt(txtAddKus.getText()));
					dataManager.addSurovinyVyrobku(sV);					
					txtAddKus.setText("");
					cmbAddSchemaSur.setSelectedIndex(-1);
					cmbAddSchemaVyr.setSelectedIndex(-1);
					updateCmbModels();
				}
				
			}
		});
		schema.add(btnAddSchema);
		
		JLabel lblOdebrnSurovinOd = new JLabel("Odebrat surovinu od v\u00FDrobku:");
		lblOdebrnSurovinOd.setBounds(10, 155, 203, 14);
		schema.add(lblOdebrnSurovinOd);
		
		JLabel label_10 = new JLabel("V\u00FDrobek:");
		label_10.setBounds(10, 184, 64, 14);
		schema.add(label_10);
		
		cmbDelSchemaVyr = new JComboBox<>(vCmbModelDelSch);
		cmbDelSchemaVyr.setBounds(91, 184, 122, 20);
		cmbDelSchemaVyr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO
				int idV = cmbDelSchemaVyr.getModel().getElementAt(cmbDelSchemaVyr.getSelectedIndex()).getId();
				sCmbModelDelSch = new SurovinyCmbModel(dataManager.getSurovinyByIdVyrobku(idV));
				cmbDelSchemaSur.setModel(sCmbModelDelSch);
				cmbDelSchemaSur.setEnabled(true);
			}
		});
		schema.add(cmbDelSchemaVyr);
		
		JLabel label_12 = new JLabel("Surovina:");
		label_12.setBounds(10, 209, 64, 14);
		schema.add(label_12);
		
		cmbDelSchemaSur = new JComboBox<>();
		cmbDelSchemaSur.setBounds(91, 209, 122, 20);
		cmbDelSchemaSur.setEnabled(false);
		schema.add(cmbDelSchemaSur);
		
		JButton btnDelSchema = new JButton("Odebrat");
		btnDelSchema.setBounds(124, 240, 89, 23);
		btnDelSchema.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int indexV = cmbDelSchemaVyr.getSelectedIndex();
				int indexS = cmbDelSchemaSur.getSelectedIndex();
				if(indexV != -1 && indexS != -1){
				int idS = cmbDelSchemaSur.getModel().getElementAt(indexS).getId();
				int idV = cmbDelSchemaVyr.getModel().getElementAt(indexV).getId();
				dataManager.delSurovinyVyrobku(idV, idS);
				cmbDelSchemaSur.setSelectedIndex(-1);
				cmbDelSchemaSur.setEnabled(false);
				updateCmbModels();
				JOptionPane.showMessageDialog(tabbedPane, "Surovina od výrobku úspìšnì smazána!", "Úspìch", JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(tabbedPane, "Nejdøíve vyberte výrobek a jeho surovinu!", "Chyba",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		schema.add(btnDelSchema);
		
		JPanel sledovani_stavu = new JPanel();
		tabbedPane.addTab("Sledov\u00E1n\u00ED stavu", null, sledovani_stavu, null);
		sledovani_stavu.setLayout(null);
		
		JLabel lblSledovnStavuSurovin = new JLabel("Sledov\u00E1n\u00ED stavu surovin");
		lblSledovnStavuSurovin.setBounds(10, 11, 156, 14);
		sledovani_stavu.add(lblSledovnStavuSurovin);
		
//		JLabel lblNzev_2 = new JLabel("N\u00E1zev:");
//		lblNzev_2.setBounds(10, 36, 57, 14);
//		sledovani_stavu.add(lblNzev_2);
		
		//Sledovani stavu surovin na sklade
//		cmbNazevSur = new JComboBox<>(sCmbModelStav);
//		cmbNazevSur.setBounds(77, 33, 165, 20);
//		cmbNazevSur.setVisible(false);
//		sledovani_stavu.add(cmbNazevSur);
		
		JCheckBox chckbxKusy = new JCheckBox("Po\u010Det kus\u016F");
		chckbxKusy.setBounds(270, 7, 97, 23);
		sledovani_stavu.add(chckbxKusy);
		
		JCheckBox chckbxVaha = new JCheckBox("V\u00E1ha");
		chckbxVaha.setBounds(270, 32, 97, 23);
		sledovani_stavu.add(chckbxVaha);
		
		JCheckBox chckbxMaterial = new JCheckBox("Materi\u00E1l");
		chckbxMaterial.setBounds(270, 58, 97, 23);
		sledovani_stavu.add(chckbxMaterial);
		
//		JCheckBox chckbxKontrolaMinima = new JCheckBox("Kontrola minima");
//		chckbxKontrolaMinima.setBounds(369, 7, 128, 23);
//		sledovani_stavu.add(chckbxKontrolaMinima);
		
		JButton btnZobrazSur = new JButton("Zobraz");
		btnZobrazSur.setBounds(10, 89, 89, 23);
		btnZobrazSur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent paramActionEvent) {
				JDialog oknoTab = new JDialog();
				oknoTab.setBounds(50, 50, 500, 500);
				oknoTab.setTitle("prehled surovin");
				List<String> sloupce = new ArrayList<>();
				sloupce.add("název");
				if (chckbxKusy.isSelected()) sloupce.add("Kusy");
				if (chckbxMaterial.isSelected()) sloupce.add("Material");
				if (chckbxVaha.isSelected()) sloupce.add("Váha");
				
				JTable tableSur = new JTable(new SurovinyTableModel(dataManager.getAllSuroviny(), sloupce));
				oknoTab.add(new JScrollPane(tableSur),"Center");
				oknoTab.setVisible(true);
				
			}
		});
		sledovani_stavu.add(btnZobrazSur);
		
		JLabel lblSledovnStavuVrobk = new JLabel("Sledov\u00E1n\u00ED stavu v\u00FDrobk\u016F");
		lblSledovnStavuVrobk.setBounds(10, 211, 156, 14);
		sledovani_stavu.add(lblSledovnStavuVrobk);
		
//		JComboBox cmbNazevVyr = new JComboBox();
//		cmbNazevVyr.setBounds(77, 233, 165, 20);
//		sledovani_stavu.add(cmbNazevVyr);
		
//		JLabel label_11 = new JLabel("N\u00E1zev:");
//		label_11.setBounds(10, 236, 57, 14);
//		sledovani_stavu.add(label_11);
		
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
		
//		JCheckBox chckbxPouziti = new JCheckBox("Pou\u017Eit\u00ED");
//		chckbxPouziti.setBounds(369, 232, 97, 23);
//		sledovani_stavu.add(chckbxPouziti);
		
		JButton btnZobrazVyr = new JButton("Zobraz");
		btnZobrazVyr.setBounds(10, 289, 89, 23);
		btnZobrazVyr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog oknoTab = new JDialog();
				oknoTab.setBounds(50, 50, 500, 500);
				oknoTab.setTitle("pøehled výrobkù");
				List<String> sloupce = new ArrayList<>();
				sloupce.add("název");
				if (chckbxSeri.isSelected()) sloupce.add("Seriové_èíslo");
				if (chckbxVyska.isSelected()) sloupce.add("Výška");
				if (chckbxSirka.isSelected()) sloupce.add("Šíøka");
				if (chckbxHloubka.isSelected()) sloupce.add("Hloubka");
				
				JTable tableSur = new JTable(new VyrobkyTableModel(dataManager.getAllVyrobky(), sloupce));
				oknoTab.add(new JScrollPane(tableSur),"Center");
				oknoTab.setVisible(true);
			}
		});
		sledovani_stavu.add(btnZobrazVyr);
		

		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 146, 514, 14);
		sledovani_stavu.add(separator_2);
		
		JPanel kusovnik = new JPanel();
		tabbedPane.addTab("Kusovn\u00EDk", null, kusovnik, null);
		kusovnik.setLayout(null);
		
		JLabel lblSloenVrobku = new JLabel("Slo\u017Een\u00ED v\u00FDrobku:");
		lblSloenVrobku.setBounds(10, 20, 104, 14);
		kusovnik.add(lblSloenVrobku);
		
		cmbKusSlozeniVyr = new JComboBox<>(vCmbModelKusSlozeniVyr);
		cmbKusSlozeniVyr.setBounds(252, 12, 146, 20);
		kusovnik.add(cmbKusSlozeniVyr);
		
		JButton btnKusSlozeniVyr = new JButton("Zobraz");
		btnKusSlozeniVyr.setBounds(435, 11, 89, 23);
		btnKusSlozeniVyr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent paramActionEvent) {
				if(cmbKusSlozeniVyr.getSelectedIndex() != -1){
				int idV = cmbKusSlozeniVyr.getModel().getElementAt(cmbKusSlozeniVyr.getSelectedIndex()).getId();
				JDialog oknoTab = new JDialog();
				oknoTab.setBounds(50, 50, 500, 500);
				oknoTab.setTitle("pøehled surovin");			
				JTable tableSur = new JTable(new SurovinyByVyrTableModel(dataManager.getSurovinuByIdVyr(idV)));
				oknoTab.add(new JScrollPane(tableSur),"Center");
				oknoTab.setVisible(true);
			}else{
				JOptionPane.showMessageDialog(tabbedPane, "Musíte vybrat výrobek");
			}
			}
		});
		kusovnik.add(btnKusSlozeniVyr);
		
		JLabel lblVrobekObsahujeDanou = new JLabel("V\u00FDrobky obsahuj\u00EDc\u00ED druh suroviny:");
		lblVrobekObsahujeDanou.setBounds(10, 45, 178, 14);
		kusovnik.add(lblVrobekObsahujeDanou);
		
		cmbKusObsahujeSur = new JComboBox<>(dsCmbModelStav);
		cmbKusObsahujeSur.setBounds(252, 42, 146, 20);
		kusovnik.add(cmbKusObsahujeSur);
		
		JButton btnKusObsahujeSur = new JButton("Zobraz");
		btnKusObsahujeSur.setBounds(435, 41, 89, 23);
		btnKusObsahujeSur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cmbKusObsahujeSur.getSelectedIndex() != -1){
				int idDS = cmbKusObsahujeSur.getModel().getElementAt(cmbKusObsahujeSur.getSelectedIndex()).getId();				
				JDialog oknoTab = new JDialog();
				oknoTab.setBounds(50, 50, 500, 500);
				oknoTab.setTitle("pøehled surovin");
				List<String> sloupce = new ArrayList<>();
				sloupce.add("název"); sloupce.add("sériové èíslo");
				sloupce.add("výška"); sloupce.add("šíøka");
				sloupce.add("hloubka");
				JTable tableSur = new JTable(new VyrobkyByIdDsurTableModel(dataManager.getVyrobkyByIdDSur(idDS), sloupce));
				oknoTab.add(new JScrollPane(tableSur),"Center");
				oknoTab.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(tabbedPane, "Musíte vybrat druh suroviny");
				}
				
			}
		});
		kusovnik.add(btnKusObsahujeSur);
	}
}
