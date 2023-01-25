package LogicalProgram;

public class FactorialNumber {

	public static void main(String[] args) {

		
		//Example-6*5*4*3*2*1
		
		int a=6;
		int fact=1;
		
		for (int i=1;i<=5;i++) {
			
			fact=fact*i;
			//System.out.println(fact);
		}
		
		System.out.println(fact);
	}

}
