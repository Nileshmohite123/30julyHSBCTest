package Collection_List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {

		LinkedList<String> LL=new LinkedList<String>();//strore homo data string type
	
		LL.add("A");
		LL.add("w");
		LL.add("h");
		LL.add("g");
		LL.add("s");
		LL.add("v");
		System.out.println(LL);
		
		LinkedList<String> LL1=new LinkedList<String>();
		//Addall
		LL1.addAll(LL);
		System.out.println(LL1);
		
		//Removeall
		LL1.removeAll(LL);
		System.out.println(LL1);
		System.out.println(LL1.isEmpty());
		
		//collection-sort
		Collections.sort(LL);
		System.out.println(LL);
		
		//shuffle
		Collections.shuffle(LL);
		System.out.println(LL);
		
		//addfirst
		LL.addFirst("Hello");
		System.out.println(LL);
		
		LL.addLast("Hi");
		System.out.println(LL);
		
		System.out.println(LL.getFirst());
	}

}
