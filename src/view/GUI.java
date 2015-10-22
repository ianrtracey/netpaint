package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class GUI extends JFrame {
	
	public static void main(String[] args) {
		GUI myGui = new GUI();
	}
	
	// Declarations for the Image Canvas
	JPanel        myImageContainer;
	JScrollPane   myImageScrollPane;
	Canvas        myCanvas;

	// Declarations for the Button Selections
	JPanel        myButtonContainer;
	ButtonGroup   drawSelections;
	JRadioButton  lineButton;
	JRadioButton  rectButton;
	JRadioButton  ovalButton;	
	JRadioButton  imagButton;	
	
	// Declarations for the Color Chooser
	JPanel        colorChooserPanel;
	JColorChooser myColorChooser;
	
	public GUI() {
		this.initGUI();
		this.initListeners();
	
	} // Ends Constructor
	

	private void initGUI(){
		
		this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.setLocation(84, 84);
		this.setSize(1080,840);
		this.setTitle("GUI Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		// Image Canvas
		myCanvas = new Canvas();
		myImageScrollPane = new JScrollPane(myCanvas);
		myImageScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		myImageScrollPane.setPreferredSize(new Dimension(1080,540));
			
		// Button Selections
		lineButton     = new JRadioButton("Draw Line");
		rectButton     = new JRadioButton("Draw Rectangle");		
		ovalButton     = new JRadioButton("Draw Oval");		
		imagButton     = new JRadioButton("Draw Image");	
		drawSelections = new ButtonGroup();
		
		drawSelections.add(lineButton);
		drawSelections.add(rectButton);
		drawSelections.add(ovalButton);
		drawSelections.add(imagButton);
		
		myButtonContainer = new JPanel();
		myButtonContainer.add(lineButton);
		myButtonContainer.add(rectButton);
		myButtonContainer.add(ovalButton);
		myButtonContainer.add(imagButton);
		
		// Color Chooser
		colorChooserPanel = new JPanel();
		myColorChooser = new JColorChooser();
		colorChooserPanel.add(myColorChooser);
		

		// And throw 'em all into the JFrame
		this.getContentPane().add(myImageScrollPane);
		this.getContentPane().add(myButtonContainer);
		this.getContentPane().add(colorChooserPanel);
		this.pack();
	
	} // Ends Method initGUI
	
	private void initListeners() {
		// TODO Auto-generated method stub
		
	} // Ends Method initListeners
	
	
	private class radioButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.toString());
			
		}
		
		
		
	}
	



} // Ends Class GUI
