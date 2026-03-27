package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Shape;

import org.junit.jupiter.api.Test;

class TestTrial {

	
	@Test
	void testcomputeSquareArea()
	{
		Shapes shape=new Shapes();
		assertEquals(576,shape.computeSquareArea(24));
	}
	
	@Test
	void testComputeSquareArea_WithMeaasage()
	{
		Shapes shape=new Shapes();
		assertNotEquals(576,shape.computeSquareArea(24),()->"Message to dev if test case failed");

	}
	@Test
	void testComputeSquareArea_WithSupplier()
	{
		Shapes shape=new Shapes();
		assertNotEquals(576,shape.computeSquareArea(24),()->"Message to dev if test case failed(supplier)");

	}
	
	@Test
	void test()
	{
		String str="Junit";
		assertTrue(str.equals("Junit"));
	}
	
//	if we pass only message to display if fail then it will be evaluated whether it is passed or failed 
//	but with supplier it will be computed only when test case fails.

}
