package LogicalProgram;

import java.util.Scanner;

public class FibonicciSeriesUserInput {

	public static void main(String[] args) {

		int a=-1,b=1,c;
		
		System.out.println("Enter any number");
		
		
		Scanner scan=new Scanner(System.in);
		
		int num;
		num=scan.nextInt();
		for (int i=0;i<=num;i++) {
			
			c=a+b;
			System.out.println(" "+c);
			
			a=b;
			b=c;
		}
	}

}
