package org.techsoft.sklad.model;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import org.techsoft.sklad.pojo.Suroviny;


public class SurovinyCmbModel extends DefaultComboBoxModel<Suroviny> {
	private static final long serialVersionUID = -1959762421651455693L;
	private List<Suroviny> suroviny = null;
	
	public SurovinyCmbModel(List<Suroviny> suroviny) {
		this.suroviny = suroviny;
	}

	public List<Suroviny> getSuroviny() {
		return suroviny;
	}

	public void setSuroviny(List<Suroviny> suroviny) {
		this.suroviny = suroviny;
	}
	
	public int getSize() {
		return suroviny.size();
	}
	
	@Override
	public Suroviny getElementAt(int paramInt) {
		return suroviny.get(paramInt);
	}
	
	@Override
	public void removeElementAt(int index) {
		suroviny.remove(index);
	}
	
	@Override
	public void addElement(Suroviny paramE) {
		suroviny.add(paramE);
	}
	
	
	
}
