package Collection_List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList AL=new ArrayList();
		AL.add("D");
		AL.add("B");
		AL.add("A");
		AL.add("X");
		System.out.println(AL);
		
		ArrayList Duplicate=new ArrayList();
		//1 Addall
		
		Duplicate.addAll(AL);
		System.out.println(Duplicate);
		
		//Removeall
		Duplicate.removeAll(AL);
		System.out.println(Duplicate);
		System.out.println(Duplicate.isEmpty());
		
		Collections.sort(AL, Collections.reverseOrder());
		System.out.println(AL);
		
		Collections.shuffle(AL);  //shuffle method used to randmly index changed
		System.out.println(AL);
		
		
	}
	

}
