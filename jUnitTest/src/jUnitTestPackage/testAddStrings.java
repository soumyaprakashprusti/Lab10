package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		//fail("Not yet implemented");
		JUnitFunctions junitstring = new JUnitFunctions();
		String result = junitstring.addStrings("Hello", "World");
		assertEquals("HelloWorld", result);
	}
}
