package org.cvtc.shapes;


public abstract class Shape {

	// instantiate variable
	private Dialog messageBox;
	
	// getter and setter for messageBox
	protected Dialog getMessageBox() {
		return messageBox;
	}
	
	public void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	// constructor function
	public Shape(Dialog messageBox) {
		super();
	}
	
	// instantiating methods
	public abstract float surfaceArea();
	public abstract float volume();

}
