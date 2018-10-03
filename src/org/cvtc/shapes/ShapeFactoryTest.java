package org.cvtc.shapes;

import org.junit.Test;

public class ShapeFactoryTest {

	@Test
	public void testSphere() {
		ShapeFactory testShapeFactory = new ShapeFactory(null);
		Shape shape = testShapeFactory.make(ShapeType.SPHERE);
		assert(shape instanceof Sphere);
	}
	
	@Test
	public void testCylinder() {
		ShapeFactory testShapeFactory = new ShapeFactory(null);
		Shape shape = testShapeFactory.make(ShapeType.CYLINDER);
		assert(shape instanceof Cylinder);
	}
	
	@Test
	public void testCuboid() {
		ShapeFactory testShapeFactory = new ShapeFactory(null);
		Shape shape = testShapeFactory.make(ShapeType.CUBOID);
		assert(shape instanceof Cuboid);
	}
	
}
