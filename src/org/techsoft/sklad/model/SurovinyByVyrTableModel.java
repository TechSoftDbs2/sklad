package org.techsoft.sklad.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.techsoft.sklad.pojo.Suroviny;

public class SurovinyByVyrTableModel extends AbstractTableModel{
	private List<String> s = null;
	private String[] sloupce = {"Název","Kusy"};
	
	public SurovinyByVyrTableModel(List<String> sur) {
		this.s = sur;
	}

	@Override
	public int getRowCount() {
		// pocet radku
		return s.size()/2;
	}

	@Override
	public int getColumnCount() {
		// pocet sloupcu
		return sloupce.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		rowIndex*=2;
		switch (columnIndex) {
		case 0:
			return s.get(rowIndex);
		case 1:
			return s.get(rowIndex+1);
		default:
			return null;
		}
		
	}
	
	@Override
	public String getColumnName(int column) {
		
		return sloupce[column];
	}

	public List<String> getS() {
		return s;
	}

	public void setS(List<String> s) {
		this.s = s;
	}	
	
	
}
