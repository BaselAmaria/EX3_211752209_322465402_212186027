package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class weakMethod_q4_a {
	
	@Test
	public void weakmethod_q4_a_1() {
		int result = WeakClass.weakMethod4(2, 1);
		int expected = -1;
		assertEquals(expected, result);
	}
	
	@Test
	public void weakmethod_q4_a_2() {
		int result = WeakClass.weakMethod4(10, 5);
		int expected = 1;
		assertEquals(expected, result);
	}
	
	@Test
	public void weakmethod_q4_a_3() {
		int result = WeakClass.weakMethod4(-10, 5);
		int expected = -1;
		assertEquals(expected, result);
	}
	
	@Test
	public void weakmethod_q4_a_4() {
		int result = WeakClass.weakMethod4(3, 5);
		int expected = -1;
		assertEquals(expected, result);
	}

}
