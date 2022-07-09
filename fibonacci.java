package Week1.Day1;

public class fibonacci {
	public static void main(String[] args) {
		int x=0,y=1,sum,limit=10;
		System.out.print(" "+x);
		System.out.print(" "+y);
		
		for (int i = 2; i < limit; ++i) {
			
			
		sum=x+y;
		System.out.print(" "+sum);
		
		x=y;
		y=sum;
		
		
		}	
	}

}
