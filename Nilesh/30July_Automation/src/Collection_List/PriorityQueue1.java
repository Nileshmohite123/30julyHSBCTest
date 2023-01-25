package Collection_List;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {

		//Insetion order is preserved
		//Duplicate are allowed
		//Home type of data
		
		PriorityQueue pq= new PriorityQueue();
		PriorityQueue pq1= new PriorityQueue();
		

		
		//adding element
		//1 add method
		//pq.add("A");
		pq.add("C");
		pq.add("E");
		pq.add("H");
		
		System.out.println(pq);
		
		//offer
		//pq.offer("Z");
		pq.offer("A");
		pq.offer("L");
		pq.offer("M");
		pq.offer("O");
		
		System.out.println(pq);
		
		//elemeents and peek
		System.out.println(pq.element());
		System.out.println(pq.peek());
		
	//	System.out.println(pq1.element());  //" java.util.NoSuchElementException
		System.out.println(pq1.peek());   // null
		
		//remove and poll
		System.out.println(pq.remove());
		System.out.println(pq);
		
	//	System.out.println(pq1.remove());//exception	
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq1.poll());
		
		System.out.println();
		System.out.println("Reading element using for each loop");
		
		for(Object obj:pq) {
			System.out.println(obj);
		}
		
		
	}

}
