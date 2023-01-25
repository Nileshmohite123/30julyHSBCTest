package Collection_List;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {

		HashSet hs=new HashSet(); //DC-16 and LF-0.75,hetro
		HashSet hs1=new HashSet(200,(float) 0.99); // hetro
		
		HashSet<String> hs2=new HashSet<String>();   //homo
		 hs.add(100);
		 hs.add("java");
		 hs.add('D');
		 hs.add(true);
		 hs.add(100);    //duplicate
		 hs.add(null);    //dup
		 hs.add(null);
		 
		 System.out.println(hs);
		 
		 System.out.println(hs.add("java"));
		 System.out.println(hs);
		 
		 //if ur trying to add duplicate element then it will return false
		 //if the elements is not present in Hashset that time it will return true
		 
		 // Remove
		 hs.remove('D');
		 System.out.println(hs);
		 hs.remove(2);   //index are preserved so using index not remove
		 
		 // set method and get method not presend in hashset
		 
		 // contains
		 System.out.println(hs.contains("java")); //true //used to element present or not
		 
		 System.out.println(hs.contains("python"));//false
		 
		 //isempty
		 System.out.println(hs.isEmpty());  //false
		 System.out.println(hs1.isEmpty());  //true
		 
		 System.out.println();
		 
		 //for (int i=0;i<hs.size();i++) {    get method not present so for loop not
		//	 System.out.println(hs.get(i));   to hashset
		// }
		 
		 for(Object obj:hs) {
			 System.out.println(obj);
		 }
		 System.out.println();
		 
		 Iterator it=hs.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}
}
