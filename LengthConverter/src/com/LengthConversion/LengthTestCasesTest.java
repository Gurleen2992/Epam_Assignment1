package com.LengthConversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LengthTestCasesTest {
	@Test
	void testObject() {
		Meter m=new Meter();
		Feet f=new Feet();
		Inch i=new Inch();
		assertNotNull(m);
		assertNotNull(f);
		assertNotNull(i);
	}
	@Test
	void testMethodDef()
	{
		
	}
	
	@Test
	void testMetreConversion() {
		Meter m=new Meter();
		double output = m.convert1(10);
		assertEquals(0.254,output);
		output = m.convert2(10);
		assertEquals(32.8084,output);
	}
	
	@Test
	void testFeetConversion() {
		Feet f=new Feet();
		double output = f.convert1(10);
		assertEquals(3.048,output);
		output = f.convert2(10);
		assertEquals(120,output);
	}
	
	@Test
	void testInchConversion() {
		Inch i=new Inch();
		double output = i.convert1(10);
		assertEquals(393.7,output);
		output = i.convert2(10);
		assertEquals(0.833,output);
	}

}
