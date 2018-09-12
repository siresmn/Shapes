package org.cvtc.shapes;

import javax.swing.JFrame;

public abstract class Shape {

	// instantiating methods
	public abstract float surfaceArea();
	public abstract float volume();
	public abstract void render();
	
	// create instance of basic frame for dialogue boxes
	public JFrame frame = new JFrame("Frame");
}
