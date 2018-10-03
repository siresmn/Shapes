package org.cvtc.shapes;

public class Cuboid extends Shape implements Renderer {

	// instantiate variables
	private float width = (float) 0.0;
	private float height = (float) 0.0;
	private float depth = (float) 0.0;
	private String message;
	private String title;
	
	// constructor for Cuboid class
	public Cuboid(Dialog messageBox, float width, float height, float depth) {
		super(messageBox); 
		
		// make sure dimensions given are not negative
		if (width < 0 || height < 0 || depth < 0) {
			//JOptionPane.showMessageDialog(frame, "Please enter valid parameters");
			throw new IllegalArgumentException("Please enter valid parameters");
		}
		
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// getter for width
	public float getWidth() {
		return width;
	}

	// setter for width
	public void setWidth(float width) {
		this.width = width;
	}

	// getter for height
	public float getHeight() {
		return height;
	}

	// setter for height
	public void setHeight(float height) {
		this.height = height;
	}

	// getter for depth
	public float getDepth() {
		return depth;
	}

	// setter for depth
	public void setDepth(float depth) {
		this.depth = depth;
	}

	// inherited method to calculate surface area
	@Override
	public float surfaceArea() {
		float area = 2 * ((this.width * this.height) + (this.width * this.depth) + (this.height * this.depth));
		return area;
	}

	// inherited method to calculate volume
	@Override
	public float volume() {
		float volume = this.depth * this.height * this.width;
		return volume;
	}

	// inherited method to display results
	@Override
	public int render() {
		
		message = "The dimensions of the Cuboid are as follows: Width = " + this.width + "; Height = " + this.height + "; Depth = " + this.depth + "; \n"
				+ "The volume of the Cuboid is: " + volume() + "\n"
				+ "The surface area of the Cuboid is: " + surfaceArea() + "\n";
		title = "Cuboid";
		
		return super.getMessageBox().show(message, title);
		
	}
	
}
