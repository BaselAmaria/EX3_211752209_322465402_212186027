package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class weakMethod_q3_b {
	
	@Test
	public void weakmethod_q3_b_1() {
		int result = WeakClass.weakMethod3(2, 1);
		int expected = 1;
		assertEquals(expected, result);
	}
	
	@Test
	public void weakmethod_q3_b_2() {
		int result = WeakClass.weakMethod3(6, 2);
		int expected = -1;
		assertEquals(expected, result);
	}
	@Test(expected = ArithmeticException.class)
	public void weakmethod_q3_b_3() {
		WeakClass.weakMethod3(17, 0);
	}
	
	@Test
	public void weakmethod_q3_b_4() {
		int result = WeakClass.weakMethod3(-6, 2);
		int expected = 1;
		assertEquals(expected, result);
	}

}
