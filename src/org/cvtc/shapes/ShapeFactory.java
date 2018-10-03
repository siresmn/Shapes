package org.cvtc.shapes;

public class ShapeFactory {
	
	Dialog dialog;

	public Dialog getDialog() {
		return dialog;
	}

	public void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}

	public ShapeFactory(Dialog dialog) {
		super();
		this.dialog = dialog;
	}
	
	public Shape make(ShapeType type) {
		if (type == ShapeType.CUBOID) {
			return new Cuboid(null, 1, 1, 1);
		} else if (type == ShapeType.CYLINDER) {
			return new Cylinder(null, 1, 1); 
		} else if (type == ShapeType.SPHERE) {
			return new Sphere(null, 1);
		} else {
			return null;
		}
	}
}
