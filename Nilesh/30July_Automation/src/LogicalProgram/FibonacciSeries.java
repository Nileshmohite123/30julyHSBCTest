package LogicalProgram;

public class FibonacciSeries {

	public static void main(String[] args) {

		//in FS next no.is the sum of the previous number
		//Example 0 1 1 2 3 5 8 13 21 34 
		
		int a=-1,b=1,c;
		
		for (int i=0;i<=10;i++) {
			c=a+b;
			
			System.out.print(c+" ");
			a=b;
			b=c;
			//System.out.print(c+" ");
		}
	}

}
