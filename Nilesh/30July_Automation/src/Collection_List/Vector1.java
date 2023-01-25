package Collection_List;

import java.util.Iterator;
import java.util.Vector;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Vector1 {

	public static void main(String[] args) {

		Vector<Integer> vc=new Vector<Integer>(); //homo+int
		
		//vc.add
		vc.add(3);
		vc.add(4);
		vc.add(5);
		vc.add(10);
		vc.add(12);
		vc.add(14);
		vc.add(44);
		vc.add(48);
		System.out.println(vc);

		System.out.println(vc.size());
		
		//Remove
		vc.remove(4);
		System.out.println(vc);

		System.out.println(vc.get(5));
		
		//update
		vc.set(3, 100);
		System.out.println(vc);
		
		//add element
		vc.add(3, 222);
		System.out.println(vc);
		
		
		System.out.println();
		System.out.println("Reading element using forloop");
		
		for(int i=0;i<vc.size();i++) {
			System.out.println(vc.get(i));
		}
		System.out.println();
		System.out.println("Reading element using for each loop");
		
		for(Integer it:vc) {
			System.out.println(it);
			
		}
		System.out.println();
		System.out.println("Reading element using iterator");
		
		Iterator it=vc.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
