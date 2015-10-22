package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serializer {
	
	public void serialize(ArrayList<PaintObject> paintObjects, String filePath) {
		try {
			FileOutputStream fileOut = new FileOutputStream("/data/paintObjects.ser");
			ObjectOutputStream out   = new ObjectOutputStream(fileOut);
			for (PaintObject paintObject : paintObjects) {
				out.writeObject(this);
			}
			out.close();
			fileOut.close();
			System.out.println("Serialized paint objects successfully");
		} catch (IOException i) {
			
			i.printStackTrace();
		}
	}
		
}
