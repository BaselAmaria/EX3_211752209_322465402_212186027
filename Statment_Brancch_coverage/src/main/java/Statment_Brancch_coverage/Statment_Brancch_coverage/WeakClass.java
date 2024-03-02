package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	
	
	public static int weakMethod1(int x, int y) {
		int c = x / y;
		if(c > 0)
			return 1;
		else
			return -1;
		
	}
	
	
	public static int weakMethod2(int x, int y) {
		if (x < 0) {
            x += 1;
        } 
		if (x / y > 0) {
            return 1;
            }
        
		return -1;
	}

}
