package org.techsoft.sklad.model;

import java.util.List;

import javax.swing.DefaultComboBoxModel;

import org.techsoft.sklad.pojo.DruhySurovin;

public class DruhySurovinComboBoxModel extends DefaultComboBoxModel<DruhySurovin> {
	private static final long serialVersionUID = 1L;
	
	private List<DruhySurovin> druhyS = null;
	
	public DruhySurovinComboBoxModel(List<DruhySurovin> druhyS) {
		this.druhyS = druhyS;
	}

	public List<DruhySurovin> getDruhyS() {
		return druhyS;
	}


	public void setDruhyS(List<DruhySurovin> druhyS) {
		this.druhyS = druhyS;
	}


	
	public int getSize() {
		return druhyS.size();
	}
	


	@Override
	public DruhySurovin getElementAt(int index) {	
		return druhyS.get(index);
	}
	
	@Override
	public void removeElementAt(int index) {
		druhyS.remove(index);
	}
	
	@Override
	public void addElement(DruhySurovin paramE) {
		druhyS.add(paramE);
	}
	
	
	

	

}
