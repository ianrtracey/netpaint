package model;

public abstract class PaintObject{
	
	Color color;
	Coordinates coordinates;
	int height, width;
	
	public PaintObject(Color color, Coordinates coordinates, int width, int height) {
		this.color       = color;
		this.coordinates = coordinates;
		this.width       = width;
		this.height		 = height;
	}
	
	public Color getColor() {
		return color;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	abstract void draw();


	
	
	
	
	
	
	

}
