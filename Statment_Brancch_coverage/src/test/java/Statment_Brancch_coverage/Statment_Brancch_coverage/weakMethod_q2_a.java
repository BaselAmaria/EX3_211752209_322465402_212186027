package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;

public class weakMethod_q2_a {
	
	@Test(expected = ArithmeticException.class)
	public void weakmethod1a() {
		WeakClass.weakMethod2(-5, 0);
	}

}
