package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {

	@Test
	public void testSurfaceArea() {
		Sphere sphere1 = new Sphere(1);
		assertEquals(12.57, sphere1.surfaceArea(), 0.02);
	}	

	@Test
	public void testVolume() {
		Sphere sphere1 = new Sphere(2);
		assertEquals(33.51, sphere1.volume(), 0.02);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSphere() {
		Sphere sphere = new Sphere(-3);
	}

	@Test
	public void testGetRadius() {
		Sphere sphere1 = new Sphere(3);
		assertEquals(3, sphere1.getRadius(), 0.02);
	}

}
