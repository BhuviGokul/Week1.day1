package Week1.Day1;

public class Isprimenumber {
	
	public static void main(String[] args) {
		int m,n=5;
		m=n/2;
	
		
		for (int i = 2; i <=m; i++) {
			
			if(n%i==0) {
				
			System.out.println(n+" is not prime number");
			break;
			
			}else {
				System.out.println(n+" is prime number");
			}
			
		}
	}

}
