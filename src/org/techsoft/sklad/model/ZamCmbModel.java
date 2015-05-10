package org.techsoft.sklad.model;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import org.techsoft.sklad.pojo.Zamestnanci;

public class ZamCmbModel extends DefaultComboBoxModel<Zamestnanci>{
	private static final long serialVersionUID = -8851232720384569816L;
	private List<Zamestnanci> zamestnanci = null;
	

	public ZamCmbModel(List<Zamestnanci> zamestnanci) {
		this.zamestnanci = zamestnanci;
	}

	public List<Zamestnanci> getZamestnanci() {
		return zamestnanci;
	}

	public void setZamestnanci(List<Zamestnanci> zamestnanci) {
		this.zamestnanci = zamestnanci;
	}
	
	public int getSize() {
		return zamestnanci.size();
	}
	
	@Override
	public Zamestnanci getElementAt(int paramInt) {
		return zamestnanci.get(paramInt);
	}
	
	@Override
	public void removeElementAt(int index) {
		zamestnanci.remove(index);
	}
	
	@Override
	public void addElement(Zamestnanci paramE) {
		zamestnanci.add(paramE);
	}
	
}
