package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;

public class CylinderTest {

	@Test
	public void testSurfaceArea() {
		Cylinder cylinder1 = new Cylinder(1, 2);
		assertEquals(18.85, cylinder1.surfaceArea(), 0.02);
	}

	@Test
	public void testVolume() {
		Cylinder cylinder1 = new Cylinder(2, 3);
		assertEquals(37.7, cylinder1.volume(), 0.02);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testCylinder() {
		Cylinder cylinder1 = new Cylinder(-1, 1);
	}

	@Test
	public void testGetRadius() {
		Cylinder cylinder1 = new Cylinder(3, 4);
		assertEquals(3, cylinder1.getRadius(), 0.02);
	}

	@Test
	public void testGetHeight() {
		Cylinder cylinder1 = new Cylinder(2, 1);
		assertEquals(1, cylinder1.getHeight(), 0.02);
	}

}
