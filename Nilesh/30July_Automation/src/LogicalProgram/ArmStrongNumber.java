package LogicalProgram;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		//133=1^3=1,3^3=27,3^3=27  =55 not armStrongNumber
		//153=1^3=1,5^3=125,3^3=27 =153 Armstrong Number
		
		
		int sum,p,rem;
		
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		p=num;
		
		for(sum=0;num>0;num=num/10) {
			
			rem=num%10;
			
			sum=sum+rem*rem*rem;
		}
		
		if(sum==p) {
			System.out.println("Armstrong Number");
		}
		
		else {
			System.out.println("Not Armstrong Number");
		}
	}

}
