package widok;

import javax.swing.*;

import java.awt.*;

public class PanelGry extends JPanel {
	private int w = 350;
	private int h = 300;
	private int x0=200;
	private int y0=100;
	CircleList kola = new CircleList(x0,y0);
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.GRAY);
		
		g.setColor(Color.WHITE);
		for(int i = 0; i < 8; i++){
			g.drawLine(x0 + i*50, y0, x0 + i*50, h + y0 );
		}
		g.drawLine(x0, h+y0, w+x0, h + y0 );
		
		kola.adCircle(0,1,1);
		kola.adCircle(5,3,2);
		kola.drawCircle(g);
		
		int[] xPoints=new int[3];
		int[] yPoints=new int[3];
		g.setColor(Color.WHITE);
		for(int i=0; i<7; i++){
			xPoints[0]=x0+10+i*50;
			xPoints[1]=xPoints[0]+30;
			xPoints[2]=xPoints[0]+15;
			yPoints[0]=y0-50;
			yPoints[1]=y0-50;
			yPoints[2]=y0-20;
			g.fillPolygon(xPoints, yPoints, 3);
		}
		
		
	}
}
