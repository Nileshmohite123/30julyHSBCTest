package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		int arr[]=new int[0];//static+similar type
		ArrayList AL=new ArrayList();//Dynamic array+homo+hetro type of data
		
		ArrayList<String>Al1=new ArrayList<String>();
		
		AL.add(100);
		AL.add("Welcome");//st
		AL.add(20.4);//double
		AL.add("A");
		AL.add(true);
		AL.add(100);
		AL.add(null);
		
		
		//print array
		System.out.println(AL);
		//size
		System.out.println("Number of array in given list"+AL.size());
		AL.add(300);
		AL.add(300);
		AL.add(300);
		AL.add(300);
		
		System.out.println(AL);
		//size
		System.out.println("Array size"+" "+AL.size());
		
		//Remove
		//Syntax Al.Remove
		//AL.remove(2);
		System.out.println(AL);
		AL.remove(20.4);
		System.out.println(20.4);
		
		//insert new element
		
		AL.add('D');
		System.out.println(AL);
		
		AL.add(2, "Java");
		System.out.println(AL);
		
		//5.Retrive specific element
		System.out.println(AL.get(2));
		
	//	System.out.println(AL.get(22));///out of bound exception
		
		System.out.println(AL.get(6));
		
		//6.Change /replace element
		AL.set(2, "Python");
		System.out.println(AL);
		
		AL.set(7, "Ruby");
		System.out.println(AL);
		
		//7 isempty
		System.out.println(AL.isEmpty());
		System.out.println(Al1.isEmpty());
		
		System.out.println("Reading element using for loop");
		System.out.println(AL.size());
		
		for(int i=0;i<AL.size();i++) {
			System.out.println(AL.get(i));
		}
		System.out.println();
		System.out.println("Reading element using for each loop");
		for(Object obj:AL) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		System.out.println("Reading element using iterator ");
		
		Iterator it=AL.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
