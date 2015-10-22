package view;

import java.awt.Graphics;

import model.*;

public class Drawer {
	
	public static void draw(PaintObject object, Graphics g) {
		if (object instanceof Line) {
			System.out.println("Printing line...");
			System.out.print("X1 : " + object.getCoordinates().getX());
			System.out.print("X1 : " + object.getCoordinates().getY());
			System.out.print("X2 : " + object.getCoordinates2().getX());
			System.out.print("X2 : " + object.getCoordinates2().getY());
			g.drawLine(object.getCoordinates().getX(), object.getCoordinates().getY(),
					   object.getCoordinates2().getX(), object.getCoordinates2().getY());
			
		} else if (object instanceof Image) {
			g.drawImage(object.getImage(), object.getCoordinates().getX(), object.getCoordinates().getY(),
					    object.getWidth(), object.getHeight(), null, null);
		} else if (object instanceof Rectangle) {
			g.drawRect(object.getCoordinates().getX(), object.getCoordinates().getY(),
					   object.getWidth(), object.getHeight());
			g.fillRect(object.getCoordinates().getX(), object.getCoordinates().getY(),
					   object.getWidth(), object.getHeight());
		} else if (object instanceof Oval) {
			g.drawOval(object.getCoordinates().getX(), object.getCoordinates().getY(),
					   object.getWidth(), object.getHeight());
			g.fillOval(object.getCoordinates().getX(), object.getCoordinates().getY(),
					   object.getWidth(), object.getHeight());
		} else {
			System.out.println("Cannot draw this shape");
		}
		
	}
	
//	class InvalidShapeException extends Exception {
//		
//		public InvalidShapException(String message) {
//			super(message);
//		}
//	}

}
