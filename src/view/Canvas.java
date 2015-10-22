package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.Color.*;

import javax.swing.JPanel;







import model.*;

public class Canvas extends JPanel implements ActionListener, MouseListener {
	
	
	
	private String drawMode;

	public Canvas() {
		this.setBackground(Color.WHITE);
		this.setPreferredSize(new Dimension(2160,2160));
	
		this.addMouseListener(this); // Super important
	}
	
	public void setDrawMode(String m){
		this.drawMode = m;
		System.out.println(drawMode);
	}
	
	private void draw(Graphics g) throws IOException {
		
		
		
		//this.IansProofOfConceptDrawCommands(g);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			this.draw(g);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("MOUSE CLICKED");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//System.out.println("MOUSE PRESSED");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.out.println("MOUSE RELEASED");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("MOUSE ENTERED");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//System.out.println("MOUSE EXITED");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	private void IansProofOfConceptDrawCommands(Graphics g){
		
		ArrayList<PaintObject> paintObjects = new ArrayList<PaintObject>();
		Line line = new Line(new MyColor(25,25,25), new Coordinates(10,10), new Coordinates(600,600));
		Image image;
		try {
			image = new Image("maxHeapify.jpg", 25, 25, 75, 75);
			Oval oval = new Oval(new MyColor(47,2,71), new Coordinates(300,71), 50, 50);
			Rectangle rectangle = new Rectangle(new MyColor(50,50,50), new Coordinates(45,300) ,90,90);
			paintObjects.add(line);
			paintObjects.add(image);
			paintObjects.add(oval);
			paintObjects.add(rectangle);
		
			Graphics2D g2d = (Graphics2D) g;
			for(PaintObject po : paintObjects) {DrawCommand.draw(po, g2d);}
		} catch (IOException e) {}
		
	} // Ends Method IansProofOfConceptDrawCommands


}
