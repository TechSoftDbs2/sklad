package org.techsoft.sklad.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.techsoft.sklad.pojo.Vyrobky;

public class VyrobkyByIdDsurTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 7447730789294643808L;
	private List<Vyrobky> v = null;
	private List<String> sloupce = null;

	public VyrobkyByIdDsurTableModel(List<Vyrobky> sur, List<String> sloupce) {
		this.v = sur;
		this.sloupce = sloupce;
	}

	@Override
	public int getRowCount() {
		// pocet radku
		return v.size();
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
			return v.get(rowIndex).getNazev();
		case 1:
			return v.get(rowIndex).getSerioveCislo();
		case 2:
			return v.get(rowIndex).getVyska();
		case 3:
			return v.get(rowIndex).getSirka();
		case 4:
			return v.get(rowIndex).getVyska();
		default:
			return null;
		}

	}

	@Override
	public String getColumnName(int column) {

		return sloupce.get(column);
	}

	public List<Vyrobky> getS() {
		return v;
	}

	public void setS(List<Vyrobky> v) {
		this.v = v;
	}

}
