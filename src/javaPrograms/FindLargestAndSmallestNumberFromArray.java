package javaPrograms;

public class FindLargestAndSmallestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]={23,53,66,22,65,32,88,3,5};
		int largest=number[0];
		int smallest=number[0];
		for(int i=1;i<number.length;i++){
			if(number[i]>largest){
				largest=number[i];
			}
			else if(number[i]<smallest){
				smallest=number[i];
			}
		}
		System.out.println("Lagest number: "+largest);
		System.out.println("Smallest number: "+smallest);

	}

}
