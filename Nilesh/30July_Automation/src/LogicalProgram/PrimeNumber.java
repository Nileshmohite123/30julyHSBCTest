package LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		//Prime Number
		//prime number is a number that is greater than 1 and divided by 1 or itself only
		
		//example-2,,3,5,7,11,17,19,23,29
		
		System.out.println("Enter a number");
		
		
		Scanner sc=new Scanner(System.in);
	    int num=	sc.nextInt();
	    int i;
	    for( i=2;i<num;i++)
	    	if(num%i==0)
	    		break;
	    
	    
	    if(i==num)
	    	
	    	System.out.println("prime number");
	    
	    else
	    	System.out.println("not prime no");
		
	}

}
