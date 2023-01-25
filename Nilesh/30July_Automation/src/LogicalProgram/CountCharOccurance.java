package LogicalProgram;

public class CountCharOccurance {

	public static void main(String[] args) {

		//FindOut a char
		
		String str="Automation java Selenium Python";
		
		int totallength=str.length();
		
		int totalcountafterremoving=str.replace("a", "").length();
		
		int count=totallength-totalcountafterremoving;
		System.out.println(count);
		
		StringBuffer sb=new StringBuffer("Automation");
		sb.reverse();
		System.out.println(sb);
	}

}
