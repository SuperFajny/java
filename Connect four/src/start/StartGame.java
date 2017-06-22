package start;


import Menu.Menu;
import kontroler.Kontroler;
import model.Modelmain;
import widok.PanelGry4;
import widok.PanelGry5;
import widok.StartGUI;
import model.ConnectFour;
import model.ConnectFive;

public class StartGame {
	Modelmain model = null;
	StartGUI view = null;
	Kontroler controler = null;
	Menu menu = null;
	
	public StartGame(int zasady){
		switch(zasady){
		
		case 0:	view = new StartGUI(zasady);
				model = new Modelmain(new ConnectFour());
				controler = new Kontroler(model, view,zasady);;
				break;
		case 1:	view = new StartGUI(zasady);
				model = new Modelmain(new ConnectFive());
				controler = new Kontroler(model, view,zasady);;
				break;
			
		case 2:	menu = new Menu();
		
					
	}
	
	}
}
