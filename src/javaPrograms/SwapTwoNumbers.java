package javaPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1st Method - using temp variable
		
		int a=10;
		int b=20;
		
		int t=0;
		System.out.println("Numbers before swapping: "+a +" "+b);
		/*t=a;
		a=b;
		b=t;
		System.out.println("Numbers after swapping: "+a +" "+b);*/
		
		
		//2nd Method - without using temp variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping: "+a +" "+b);

	}

}
