package LogicalProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		//2022 //1600
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		
		int year=sc.nextInt();
		
		int i;
		
		if((year%4==0&&year%100==0) || year%400==0)
		
	//	if(year%4==0)
			System.out.println("leap year");
		
		else
			System.out.println("not leap year");
	}

}
