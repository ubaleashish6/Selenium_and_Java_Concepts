package javaPrograms;

public class SecondLargestValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={23,44,22,54,25,76,33,64,25};
		
		int largest=arr[0];
		int secondLargest=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>largest){
				secondLargest=largest;
				largest=arr[i];
			}
			if(arr[i]<largest && arr[i]>secondLargest){
				secondLargest=arr[i];
			}
		}
		System.out.println("Largest Number: "+largest);
							
		System.out.println("Second Largest Number: "+secondLargest);

	}

}
