package model;

public class Line extends PaintObject {
	
	Coordinates coordinates2;
	 
	public Line(MyColor color, Coordinates coordinates, Coordinates coordinates2) {
		super(color, coordinates, 0, 0);
		this.setCoordinates2(coordinates2);
	}
	

	
	public void draw() {
		
	}
	
}
