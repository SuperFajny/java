package Menu;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import start.StartGame;

// Widok menu , który wyswietla sie na starcie 
// Okienka z dwoma przyciskami ConnnectFour i ConnectFive
// klikniecie na ConnectFour -> callGame(0)
//klikniecie na ConnectFive -> callGame(1)
// okno zamyka siê po wyborze

public class Menu  extends JFrame {
	
	public JButton b1;
	public JButton b2;
	JFrame ramka;
	
	
	public Menu(){
		//Menu menu = new Menu();
		go();
	}
	public void go(){
		ramka = new JFrame();
		ramka.setLayout(new FlowLayout());
		b1 = new JButton("ConnectFour");
		b2 = new JButton("ConnectFive");
		b1.addActionListener(new b1Listener());
		b2.addActionListener(new b2Listener());
		ramka.getContentPane().add(b1);
		ramka.add(b2);
		ramka.setPreferredSize(new Dimension(400, 100));
		ramka.setMinimumSize(new Dimension(400,100));
		ramka.setLocationRelativeTo(null);
		ramka.setVisible(true);
	
	}
	
	class b1Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) { 
			ramka.dispose();
		    callGame(0);
		    
	 }
		
	}
	class b2Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) { 
			ramka.dispose();
		    callGame(1);
	}
	}
	     
	public void callGame(int zasady){
		EventQueue.invokeLater(new Runnable(){

			public void run(){
				new StartGame(zasady);
			}
		});
	}
}
