package widok;


import javax.swing.*;

import java.awt.*;

	public class PanelGry5 extends JPanel {
		private int w = 450;
		private int h = 300;
		private int x0=150;
		private int y0=100;
		CircleList kola = new CircleList(x0,y0);
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			this.setBackground(Color.GRAY);
			
			g.setColor(Color.WHITE);
			for(int i = 0; i < 10; i++){
				g.drawLine(x0 + i*50, y0, x0 + i*50, h + y0 );
			}
			g.drawLine(x0, h+y0, w+x0, h + y0 );
			
			kola.adCircle(0,1,1);
			kola.adCircle(5,3,2);
			kola.drawCircle(g);
				
		}
	}

	