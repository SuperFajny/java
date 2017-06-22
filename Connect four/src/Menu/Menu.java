package Menu;

import java.awt.EventQueue;

import start.StartGame;


public class Menu {
	
	public Menu(){
		callGame(0);
	}
	
	public void callGame(int zasady){
		EventQueue.invokeLater(new Runnable(){

			public void run(){
				new StartGame(zasady);
			}
		});
	}
}
