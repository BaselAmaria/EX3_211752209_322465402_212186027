package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class weakMethod_q3_a {
	
	@Test
	public void weakmethod_q3_a_1() {
		int result = WeakClass.weakMethod3(7, 1);
		int expected = 1;
		assertEquals(expected, result);
	}
	
	@Test
	public void weakmethod_q3_a_2() {
		int result = WeakClass.weakMethod3(7, 2);
		int expected = -1;
		assertEquals(expected, result);
	}

}
