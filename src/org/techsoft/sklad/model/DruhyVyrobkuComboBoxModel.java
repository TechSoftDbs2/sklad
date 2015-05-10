package org.techsoft.sklad.model;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import org.techsoft.sklad.pojo.DruhyVyrobku;

public class DruhyVyrobkuComboBoxModel extends DefaultComboBoxModel<DruhyVyrobku>{
	private List<DruhyVyrobku> druhyV = null;
	
	
	
	public DruhyVyrobkuComboBoxModel(List<DruhyVyrobku> druhyV) {
		this.druhyV = druhyV;
	}

	public List<DruhyVyrobku> getDruhyV() {
		return druhyV;
	}

	public void setDruhyV(List<DruhyVyrobku> druhyV) {
		this.druhyV = druhyV;
	}

	@Override
	public int getSize() {
		return druhyV.size();
	}
	
	@Override
	public DruhyVyrobku getElementAt(int index) {
		return druhyV.get(index);
	}
}
