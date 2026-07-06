package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	ReverseString reverse = new ReverseString();
	@Test
	void testReverseString_OneWord() {
		
		 assertEquals("avaJ",reverse.reverseString("Java"));
		 
	}
	
	@Test
	void testReverseString_MultipleWords()
	{
		 assertEquals("garihc avaJ",reverse.reverseString("Java chirag"));
	}

}
