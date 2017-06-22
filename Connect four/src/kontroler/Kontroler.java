package kontroler;

import model.Modelmain;
import widok.StartGUI;

public class Kontroler {
	
	public Modelmain model=null;
	public StartGUI view=null;

	public Kontroler(Modelmain model, StartGUI view, int zasady){
		this.view = view;
		this.model = model;
		getColumnNumber(3);
	}
	
	public void getColumnNumber(int j){
		model.modelInsert(j);
	}
	public int getGracz(){
		return model.getGracz();
	}
}
