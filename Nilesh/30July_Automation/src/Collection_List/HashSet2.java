package Collection_List;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {

		HashSet<String> HS2=new HashSet<String>();  //Homo
		
		HS2.add("Rahul");
		HS2.add("Rohit");
		HS2.add("TT");
		HS2.add("RR");
		
		System.out.println(HS2);
		
		HashSet<String> HS3=new HashSet<String>(); //Homo
		
		HS3.addAll(HS2);
		System.out.println(HS3);
		
		//Removeall
		HS3.removeAll(HS2);
		System.out.println(HS3);
	}

}
