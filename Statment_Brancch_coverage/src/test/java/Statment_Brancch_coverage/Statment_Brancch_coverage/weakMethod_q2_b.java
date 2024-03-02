package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class weakMethod_q2_b {
	
	@Test
	public void weakmethod_q2_b1() {
		int result = WeakClass.weakMethod2(16, 9);
		int expected = 1;
		
		assertEquals(expected, result);
	}
	
	@Test
	public void weakmethod_q2_b2() {
		int result = WeakClass.weakMethod2(-7, 9);
		int expected = -1;
		
		assertEquals(expected, result);
	}

}
