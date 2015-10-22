package view;

import java.awt.Graphics;

import javax.swing.DebugGraphics;

import model.*;

public class DrawCommand {
	
	
	public static void draw(PaintObject object, Graphics g) {
		int debugPrintCode = 0; // TODO: Delete this when program works	
		
		
		if (object instanceof Line) {
			g.drawLine(object.getCoordinates().getX(), object.getCoordinates().getY(),
					   object.getCoordinates2().getX(), object.getCoordinates2().getY() );
			
			debugPrintCode = 1; // TODO: Delete this when program works	
			
		} else if (object instanceof Image) {
			g.drawImage(object.getImage(), object.getCoordinates().getX(), object.getCoordinates().getY(),
					    object.getWidth(), object.getHeight(), null, null);
			
			debugPrintCode = 2; // TODO: Delete this when program works	
				
		} else if (object instanceof Rectangle) {
			g.drawRect(object.getCoordinates().getX(), object.getCoordinates().getY(),
					   object.getWidth(), object.getHeight());
			g.fillRect(object.getCoordinates().getX(), object.getCoordinates().getY(),
					   object.getWidth(), object.getHeight());
			
			debugPrintCode = 3; // TODO: Delete this when program works
					
		} else if (object instanceof Oval) {
			g.drawOval(object.getCoordinates().getX(), object.getCoordinates().getY(),
					   object.getWidth(), object.getHeight());
			g.fillOval(object.getCoordinates().getX(), object.getCoordinates().getY(),
					   object.getWidth(), object.getHeight());
			
			debugPrintCode = 4;  // TODO: Delete this when program works		
		}
		
		debugPrints(object, debugPrintCode); // TODO: Delete this when program works	
	} // Ends Method draw
	
	// TODO: Delete this when program works	
	private static void debugPrints(PaintObject object, int command){
		switch (command){
		case 1:  System.out.println("Printing line, coords are:\nX1: " + object.getCoordinates().getX() + " | Y1 : " + object.getCoordinates().getY() + " | X2 : " + object.getCoordinates2().getX() + " | Y2 : " + object.getCoordinates2().getY()); break;	
		case 2:  System.out.println("Imag Successfully Drawn!"); break;
		case 3:  System.out.println("Rect Successfully Drawn!"); break;
		case 4:  System.out.println("Oval Successfully Drawn!"); break;
		default: System.out.println("YOLO!!!");                  break; }
	} // Ends Method debugPrints
	
} // Ends Class DrawCommand
