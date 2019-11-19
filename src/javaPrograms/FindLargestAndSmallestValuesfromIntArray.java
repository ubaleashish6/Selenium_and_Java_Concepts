package programs;

public class FindLargestAndSmallestValuesfromIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {12,1,14,66,64,77,23,12,44};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else  if(arr[i]<smallest){
				smallest=arr[i];
			
			}
		}
		System.out.println("Largest Number is: "+largest);
		System.out.println("Smallest Number is: "+smallest);
	}

}
