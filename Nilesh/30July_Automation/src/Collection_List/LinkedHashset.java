package Collection_List;

import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {

		LinkedHashSet LHS=new LinkedHashSet();
		
		//same methods are implemented which are present in hashset
		//duplicates elements are not allowed
		//insertion order is preserved
		//default capacity &LF-16&0.75
		
		LHS.add(200);
		LHS.add(300);
		LHS.add(400);
		LHS.add(500);
		LHS.add("Nilesh");
		
		System.out.println(LHS);
		
		System.out.println(LHS.add(300));//false
		
		System.out.println(LHS.add(404));
		LHS.add("Nilesh");
		System.out.println(LHS);
	}

}
