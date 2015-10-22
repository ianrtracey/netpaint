package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image extends PaintObject {
	
	BufferedImage image;
	
	public Image(String filename, int x, int y, int width, int height) throws IOException {
		super(null, new Coordinates(x,y), width, height);
		super.setImage(ImageIO.read(new File(filename))); 
	}
	
	
	public void draw() {
		
	}

}
