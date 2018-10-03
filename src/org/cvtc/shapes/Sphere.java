package org.cvtc.shapes;

public class Sphere extends Shape implements Renderer {
	
	// instantiate radius variable
	private float radius = (float) 0.0;
	private String message;
	private String title;

	// constructor for Sphere class
	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
		
		// make sure dimensions given are not negative
		if (radius < 0) {
			throw new IllegalArgumentException("Please enter valid parameters");
		} 
		this.radius = radius;
	}

	// getter for radius
	public float getRadius() {
		return radius;
	}

	// setter for radius
	public void setRadius(float radius) {
		this.radius = radius;
	}

	// inherited method to calculate surface area
	@Override
	public float surfaceArea() {
		float area = (float) (4.0 * Math.PI * Math.pow(this.radius, 2));
		return area;
	}

	// inherited method to calculate volume
	@Override
	public float volume() {
		float volume = (float) ((4.0/3.0) * Math.PI * Math.pow(this.radius, 3));
		return volume;
	}

	// inherited method to display results
	@Override
	public int render() {
		
		message = "The radius of the Sphere is: " + this.radius + "; \n"
				+ "The volume of the Sphere is: " + volume() + "\n"
				+ "The surface area of the Sphere is: " + surfaceArea() + "\n";
		title = "Sphere";

		return super.getMessageBox().show(message, title);
	}

}
