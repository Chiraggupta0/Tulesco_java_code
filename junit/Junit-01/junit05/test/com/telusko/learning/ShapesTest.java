package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	Shapes shape=new Shapes();
	@Test
	void testtestcomputeSquareArea() {
		
		
		assertEquals(576,shape.computeSquareArea(24));
	
	}
	@Test
	void testcomputeCircleArea() {
		assertEquals(78.5,shape.computeCircleArea(5),"Area of circle calculation is wrong ");
	}
	
	@Test
	void testcomputeCircleArea_supplier() {
		assertEquals(74.5,shape.computeCircleArea(5),()->"Area of circle calculation is wrong ");
	}

}
