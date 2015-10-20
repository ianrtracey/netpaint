package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Canvas extends JPanel implements ActionListener, MouseListener {
	
	private void draw(Graphics g) {
		
		ArrayList<PaintObject> paintObject = new ArrayList<PaintObject>();
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawLine(20,40,250,40);

		
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
