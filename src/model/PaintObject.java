package model;

import java.awt.image.BufferedImage;

public abstract class PaintObject{
	
	Color color;
	Coordinates coordinates, coordinates2;
	int height, width;
	BufferedImage image;
	
	public PaintObject(Color color, Coordinates coordinates, int width, int height) {
		this.color        = color;
		this.coordinates  = coordinates;
		this.width        = width;
		this.height		  = height;
		this.image        =  null;
		this.coordinates2 = null;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public BufferedImage getImage() {
		return this.image;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}
	
	public Coordinates getCoordinates2() {
		return coordinates2;
	}
	
	public void setCoordinates2(Coordinates coordinates2) {
		this.coordinates2 = coordinates2;
	}

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	

	
	abstract void draw();


	
	
	
	
	
	
	

}
