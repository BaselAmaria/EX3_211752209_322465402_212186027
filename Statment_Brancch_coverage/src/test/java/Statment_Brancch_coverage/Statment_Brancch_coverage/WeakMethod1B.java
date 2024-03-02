package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod1B {
	
	@Test
	public void weakmethod1b() {
		int result = WeakClass.weakMethod1(10, 2);
		int expected = 1;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void weakmethod1b2() {
		int result = WeakClass.weakMethod1(-10, 2);
		int expected = -1;
		
		assertEquals(expected, result);
	}

}
