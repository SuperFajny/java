package widok;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
//implements ActionListener

public class StartGUI  {
	public static final int HEIGHT = 800;
	public static final int WIDTH = 600;
	JFrame grafika;
	ArrayList<JButton> buttons;
	int zasada;

	public StartGUI(int zasady){
		super();
		this.zasada=zasady;
		this.go();
		
	}
	
	//public static void main(String[] args) {
		//StartGUI ap = new StartGUI();
		//ap.go();
		
	//}
	
	public void go(){
		JFrame grafika = new JFrame();
		grafika.setLayout(new BorderLayout());
		grafika.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel tk1 = new JLabel("Teraz gra ");
		tk1.setBackground(Color.blue);
		tk1.setSize(WIDTH, 100);
		
		if( zasada == 0){
			PanelGry4 panel4 = new PanelGry4();
			grafika.getContentPane().add(BorderLayout.CENTER, panel4);
			//
		}
		else if(zasada == 1){
			PanelGry5 panel5 = new PanelGry5();
			grafika.getContentPane().add(BorderLayout.CENTER, panel5);

		}
		grafika.getContentPane().add(BorderLayout.NORTH, tk1);
		grafika.setSize(HEIGHT,WIDTH);
		grafika.setVisible(true);
	}
	public void column(int j){
		System.out.println(j);
	}
	
	
	
}
