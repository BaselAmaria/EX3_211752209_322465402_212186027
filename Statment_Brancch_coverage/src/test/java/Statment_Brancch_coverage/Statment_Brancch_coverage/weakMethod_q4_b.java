package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class weakMethod_q4_b {
	
	@Test(expected = ArithmeticException.class)
	public void weakmethod_q4_b_1() {
		WeakClass.weakMethod4(5, 0);
	}
	
	
}
