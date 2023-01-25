package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList LL=new LinkedList();//Hetro
		LinkedList<String> LL1=new LinkedList<String>();//homo
		
		LL.add(200);
		LL.add("Welcome");
		LL.add(20.4);
		LL.add('A');
		LL.add(null);
		LL.add(true);
		

		
		System.out.println(LL);
		
		//size
		System.out.println(LL.size());
		
		//Remove
		LL.remove(20.4);
		System.out.println(LL);
		
		
		//Add element in the LL
		LL.add(3, "Java");
		System.out.println(LL);
		System.out.println(LL.get(5));
		
		//Firstindex
		System.out.println(LL.getFirst());
		
		//Lastindex
		System.out.println(LL.getLast());
		
		//7 set
		LL.set(3, false);
		System.out.println(LL);
		
		//8.isempty
		System.out.println(LL.isEmpty());  //false
		
		System.out.println(LL1.isEmpty());  //true
		
		//9 contains
		System.out.println(LL.contains("Welcome"));//true
		System.out.println(LL.contains("Hello")); //false
		
		System.out.println();
		
		System.out.println("Reading element using for Loop");
		for(int i=0;i<LL.size();i++) {
			System.out.println(LL.get(i));
		}
		
		System.out.println();
		System.out.println("Reading element using for each loop");
		
		for(Object obj:LL) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("Reading element using iterator");
		
		Iterator it=LL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}



	}

}
