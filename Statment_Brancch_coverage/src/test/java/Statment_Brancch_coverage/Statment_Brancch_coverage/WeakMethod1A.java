package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeakMethod1A {
	
	@Test(expected = ArithmeticException.class)
	public void weakmethod1a() {
		WeakClass.weakMethod1(17, 0);
	}
	

}
