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
	
	
	public static int weakMethod3(int x, int y) {
		if(y==1)
			y+=1;
		
		else if(x/y>0)
			return -1;
		
		return 1;
	}
	
	public static int weakMethod4(int x, int y) {
		if(x == 2)
			x+=3;
		
		else if(x/y>0)
			return 1;
		
		if(x==3)
			x++;
		
			return -1;
	}

}
