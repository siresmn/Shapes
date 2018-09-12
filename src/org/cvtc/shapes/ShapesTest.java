package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {

		// creating new instances of each shape
		Cuboid newCuboid = new Cuboid(2, 3, 1);
		Cylinder newCylinder = new Cylinder(2, 3);
		Sphere newSphere = new Sphere(3);
		
		// calling dialog box creating methods
		newCuboid.render();
		newCylinder.render();
		newSphere.render();
		
	}

}
