package LogicalProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		
		//12345  =54321 not palindrome
		
		//1221   == 1221 palindrome number
		
		int sum,OriginalNumber,Rem;
		
		System.out.println("Enter any number");
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		OriginalNumber=num;
		
		for(sum=0;num>0;num=num/10) {
			
			Rem=num%10;
			
			sum=sum*10+Rem;
		}
		
		if(OriginalNumber==sum) {
			System.out.println(OriginalNumber+": is a Palindrome number");
		}
		
		else {
			System.out.println(OriginalNumber+": is not Palindrome number");
		}
	}

}
