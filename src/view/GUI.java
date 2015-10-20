package view;

import javax.swing.JFrame;

public class GUI extends JFrame {
	
	public GUI() {
		initCanvas();
	}
	
	private final void initCanvas() {
		
		Canvas canvas = new Canvas();
		add(canvas);
		
		setSize(480,480);
		setTitle("GUI Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setVisible(true);
	}

}
