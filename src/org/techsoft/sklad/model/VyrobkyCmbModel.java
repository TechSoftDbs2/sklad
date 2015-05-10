package org.techsoft.sklad.model;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import org.techsoft.sklad.pojo.Vyrobky;

public class VyrobkyCmbModel extends DefaultComboBoxModel<Vyrobky>{
	private static final long serialVersionUID = 800930767112397585L;
	private List<Vyrobky> vyrobky = null;

	public VyrobkyCmbModel(List<Vyrobky> vyrobky) {
		this.vyrobky = vyrobky;
	}

	public List<Vyrobky> getVyrobky() {
		return vyrobky;
	}

	public void setVyrobky(List<Vyrobky> vyrobky) {
		this.vyrobky = vyrobky;
	}
	
	public int getSize() {
		return vyrobky.size();
	}
	
	@Override
	public Vyrobky getElementAt(int paramInt) {
		return vyrobky.get(paramInt);
	}
	
	@Override
	public void removeElementAt(int index) {
		vyrobky.remove(index);
	}
	
	@Override
	public void addElement(Vyrobky paramE) {
		vyrobky.add(paramE);
	}
	
}
