package org.techsoft.sklad.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.techsoft.sklad.pojo.Vyrobky;

public class VyrobkyTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 7447730789294643808L;
	private List<Vyrobky> v = null;
	private List<String> sloupce = null;

	public VyrobkyTableModel(List<Vyrobky> sur, List<String> sloupce) {
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
			if (sloupce.get(1) == "Seriové_èíslo")
				return v.get(rowIndex).getSerioveCislo();
			if (sloupce.get(1) == "Výška")
				return v.get(rowIndex).getVyska();
			if (sloupce.get(1) == "Šíøka")
				return v.get(rowIndex).getSirka();
			if (sloupce.get(1) == "Hloubka")
				return v.get(rowIndex).getVyska();
		case 2:
			if (sloupce.get(2) == "Sériové èíslo")
				return v.get(rowIndex).getSerioveCislo();
			if (sloupce.get(2) == "Výška")
				return v.get(rowIndex).getVyska();
			if (sloupce.get(2) == "Šíøka")
				return v.get(rowIndex).getSirka();
			if (sloupce.get(2) == "Hloubka")
				return v.get(rowIndex).getVyska();
		case 3:
			if (sloupce.get(3) == "Sériové èíslo")
				return v.get(rowIndex).getSerioveCislo();
			if (sloupce.get(3) == "Výška")
				return v.get(rowIndex).getVyska();
			if (sloupce.get(3) == "Šíøka")
				return v.get(rowIndex).getSirka();
			if (sloupce.get(3) == "Hloubka")
				return v.get(rowIndex).getVyska();
		case 4:
			if (sloupce.get(4) == "Sériové èíslo")
				return v.get(rowIndex).getSerioveCislo();
			if (sloupce.get(4) == "Výška")
				return v.get(rowIndex).getVyska();
			if (sloupce.get(4) == "Šíøka")
				return v.get(rowIndex).getSirka();
			if (sloupce.get(4) == "Hloubka")
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
