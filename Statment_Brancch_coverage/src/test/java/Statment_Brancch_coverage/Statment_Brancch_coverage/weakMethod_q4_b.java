package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class weakMethod_q4_b {
	
	@Test(expected = ArithmeticException.class)
	public void weakmethod_q4_b_1() {
		WeakClass.weakMethod4(5, 0);
	}
	
	@Test
	public void weakmethod_q4_b_2() {
		int result = WeakClass.weakMethod4(2, 5);
		int expected = -1;
		assertEquals(expected, result);
	}
	
}
