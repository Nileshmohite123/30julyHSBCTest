package Collection_List;

import java.util.HashSet;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class HashSet3 {

	public static void main(String[] args) {

		HashSet HS=new HashSet();
		
		HS.add(2);
		HS.add(3);
		HS.add(5);
		HS.add(8);
		HS.add(33);
		
		System.out.println(HS);
		
		HashSet HS1=new HashSet();
		
		HS1.add(3);
		HS1.add(44);
		HS1.add(10);
		HS1.add(33);
		
	//	HS.addAll(HS1);//Only displayed unique element
		
	//	System.out.println(HS);
		
    //	HS.retainAll(HS1);//only common element will displayed
	//	System.out.println(HS);
		
		
		System.out.println(HS.containsAll(HS1)); // False
		
		HS.removeAll(HS1);
		System.out.println(HS);
		
	}

}
