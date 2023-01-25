package LogicalProgram;

public class LargestNumber {

	public static void main(String[] args) {

		int arr[]= {4,3,1045,666,22,55};
		System.out.println(arr.length);
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max=arr[i];
			}
			
		}
		System.out.println(max);
	}

}
