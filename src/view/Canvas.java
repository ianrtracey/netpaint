package view;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	private void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawLine(20,40,250,40);

		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	

}
