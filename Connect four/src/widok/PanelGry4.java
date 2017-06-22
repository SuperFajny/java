package widok;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import kontroler.Kontroler;

public class PanelGry4 extends JPanel implements ActionListener, StrategyWidok {
	private int w = 350;
	private int h = 300;
	private int x0=200;
	private int y0=100;
	CircleList kola = new CircleList(x0,y0);
	Graphics g;
	ArrayList<JButton> buttons;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.GRAY);
		
		g.setColor(Color.WHITE);
		for(int i = 0; i < 8; i++){
			g.drawLine(x0 + i*50, y0, x0 + i*50, h + y0 );
		}
		g.drawLine(x0, h+y0, w+x0, h + y0 );
	
		
		this.setLayout(null);
		createButtons(7);
	}
	
	void createButtons(int need){
		buttons = new ArrayList<JButton>();
		for(int i =0; i < need; i++){
			String t = Integer.toString(i);
			JButton b = new JButton(t);
			buttons.add(b);
		}
		for(JButton button : buttons ){
			int i = buttons.indexOf(button);
			button.setBounds(x0+10+i*50, y0-50, 30, 40);
			button.addActionListener(this); // czy to this jest dobrze?
			this.add(button);
		}
	}
	
	public void actionPerformed(ActionEvent e){
		
		String ac = e.getActionCommand();
		int j = Integer.parseInt(ac);
		System.out.println("Przycisk " + j);
		//column(j);
		
		//controler.getColumnNumber(j);
	}
	
	public void dodajkulke(int i , int j, int gracz){
		kola.adCircle(i,j,gracz);
		kola.drawCircle(g);
	}
	
	//
}