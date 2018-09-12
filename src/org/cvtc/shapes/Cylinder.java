package org.cvtc.shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cylinder extends Shape {

	// instantiate variables
	private float radius = (float) 0.0;
	private float height = (float) 0.0;
	
	// constructor for Cylinder class
	public Cylinder(float radius, float height) {
		
		// make sure dimensions given are not negative
		if (radius < 0 || height < 0) {
			throw new IllegalArgumentException("Please enter valid parameters");
		}
		
		this.radius = radius;
		this.height = height;
	}

	// getter for radius
	public float getRadius() {
		return radius;
	}

	// setter for radius
	public void setRadius(float radius) {
		this.radius = radius;
	}

	// getter for height
	public float getHeight() {
		return height;
	}

	// setter for height
	public void setHeight(float height) {
		this.height = height;
	}

	// inherited method to calculate surface area
	@Override
	public float surfaceArea() {
		float area = (float) (2 * Math.PI * this.radius * this.height + 2 * Math.PI * Math.pow(this.radius, 2));
		return area;
	}

	// inherited method to calculate volume
	@Override
	public float volume() {
		float volume = (float) (Math.PI * Math.pow(this.radius, 2) * this.height);
		return volume;
	}

	// inherited method to display results
	@Override
	public void render() {
		
			JOptionPane.showMessageDialog(frame, 
					"The dimensions of the Cylinder are as follows: Radius = " + this.radius + "; Height = " + this.height + "; \n"
					+ "The volume of the Cylinder is: " + volume() + "\n"
					+ "The surface area of the Cylinder is: " + surfaceArea() + "\n");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
