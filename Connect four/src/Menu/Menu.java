package Menu;

import java.awt.EventQueue;

import start.StartGame;

// Widok menu , który wyswietla sie na starcie 
// Okienka z dwoma przyciskami ConnnectFour i ConnectFive
// klikniecie na ConnectFour -> callGame(0)
//klikniecie na ConnectFive -> callGame(1)
// okno zamyka siê po wyborze

public class Menu {
	
	public Menu(){
		callGame(0); // to by³o tylko do testow
	}
	
	public void callGame(int zasady){
		EventQueue.invokeLater(new Runnable(){

			public void run(){
				new StartGame(zasady);
			}
		});
	}
}
