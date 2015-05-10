package org.techsoft.sklad.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.techsoft.sklad.pojo.Suroviny;

public class SurovinyTableModel extends AbstractTableModel {
	private static final long serialVersionUID = -458786690848784662L;
	private List<Suroviny> s = null;
	// nazvy sloupcu {"Název","Kusy","Material","Vaha"}
	// private String[] sloupce = null;
	private List<String> sloupce = null;

	public SurovinyTableModel(List<Suroviny> sur, List<String> sloupce) {
		this.s = sur;
		this.sloupce = sloupce;
	}

	@Override
	public int getRowCount() {
		// pocet radku
		return s.size();
	}

	@Override
	public int getColumnCount() {
		// pocet sloupcu
		return sloupce.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return s.get(rowIndex).getNazev();
		case 1:
			if (sloupce.get(1) == "Kusy")
				return s.get(rowIndex).getKusy();
			if (sloupce.get(1) == "Material")
				return s.get(rowIndex).getMaterial();
			if (sloupce.get(1) == "Váha")
				return s.get(rowIndex).getVaha();
		case 2:
			if (sloupce.get(2) == "Kusy")
				return s.get(rowIndex).getKusy();
			if (sloupce.get(2) == "Material")
				return s.get(rowIndex).getMaterial();
			if (sloupce.get(2) == "Váha")
				return s.get(rowIndex).getVaha();
		case 3:
			if (sloupce.get(3) == "Kusy")
				return s.get(rowIndex).getKusy();
			if (sloupce.get(3) == "Material")
				return s.get(rowIndex).getMaterial();
			if (sloupce.get(3) == "Váha")
				return s.get(rowIndex).getVaha();
		default:
			return null;
		}

	}

	@Override
	public String getColumnName(int column) {

		return sloupce.get(column);
	}

	public List<Suroviny> getS() {
		return s;
	}

	public void setS(List<Suroviny> s) {
		this.s = s;
	}

}
