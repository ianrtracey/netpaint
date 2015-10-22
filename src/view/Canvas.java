package view;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.*;
import model.PaintObject;

public class Canvas extends JPanel implements ActionListener, MouseListener {
	
	private void draw(Graphics g) {
		
		ArrayList<PaintObject> paintObjects = new ArrayList<PaintObject>();
		
		Line line = new Line(new Color(25,25,25), new Coordinates(10,10,150,150));
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawLine(line.getCoordinates().getX1(), line.getCoordinates().getY1(),
					 line.getCoordinates().getX2(), line.getCoordinates().getY2());
		

		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
