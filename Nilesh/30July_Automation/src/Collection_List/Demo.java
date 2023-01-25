package Collection_List;

import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {

	PriorityQueue <Integer>pq=new PriorityQueue<Integer>();	
	
	pq.add(34);
	pq.add(64);
	pq.add(384);
	pq.add(36);
	pq.add(89);
	
	System.out.println(pq);
	
	pq.offer(22);
	System.out.println(pq);
	
	
	System.out.println(pq.element());
	
	
	
	System.out.println(pq.peek());
	
	System.out.println(pq.poll());
	System.out.println(pq);
	
	}

}
