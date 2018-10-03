package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		
		Dialog messageBox = new MessageBox();

		// creating new instances of each shape
		Cuboid newCuboid = new Cuboid(messageBox, 2, 3, 1);
		Cylinder newCylinder = new Cylinder(messageBox, 2, 3);
		Sphere newSphere = new Sphere(messageBox, 3);
		
		// calling dialog box creating methods
		newCuboid.render();
		newCylinder.render();
		newSphere.render();
		
		ShapeFactory shapeFactory = new ShapeFactory(messageBox);
		
		shapeFactory.make(ShapeType.CYLINDER);
		shapeFactory.make(ShapeType.CUBOID);
		shapeFactory.make(ShapeType.SPHERE);
		
	}

}
