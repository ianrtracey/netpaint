package view;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.*;
import model.PaintObject;

public class Canvas extends JPanel implements ActionListener, MouseListener {
	
	private void draw(Graphics g) throws IOException {
		
		ArrayList<PaintObject> paintObjects = new ArrayList<PaintObject>();

		
		Line line = new Line(new Color(25,25,25), new Coordinates(10,10), new Coordinates(600,600));
		Image image = new Image("doge.jpeg", 25, 25, 75, 75);
		Oval oval = new Oval(new Color(47,2,71), new Coordinates(300,71), 50, 50);
		Rectangle rectangle = new Rectangle(new Color(50,50,50), new Coordinates(45,300) ,90,90);
		paintObjects.add(line);
		paintObjects.add(image);
		paintObjects.add(oval);
		paintObjects.add(rectangle);
		
		Graphics2D g2d = (Graphics2D) g;
		for(PaintObject po : paintObjects) {
			Drawer.draw(po, g);
		}
		
		

		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			draw(g);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
