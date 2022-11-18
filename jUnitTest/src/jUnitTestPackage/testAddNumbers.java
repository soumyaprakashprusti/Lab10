package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		//fail("Not yet implemented");
		JUnitFunctions junit = new JUnitFunctions();
		int result = junit.addNumbers(52, 38);
		assertEquals(90, result);
	}
}
