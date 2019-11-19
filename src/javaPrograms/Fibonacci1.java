package programs;

public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fibonacci(0,1);
		
		
		//======Method 2==========================
		
		/*int a=0,b=1;
		System.out.print(a+" "+b+" ");
		int sum=0;
		while(sum<100) {
			
			sum=a+b;
			if(sum<100) {
				System.out.print(sum+" ");
				a=b;
				b=sum;
			}
			
			
		}*/
		
		
		//========Method 3 -> Using array=============
		
		int fibonacci[]=new int[100];
		fibonacci[0]=0;
		fibonacci[1]=1;
		
		for(int i=2;i<20;i++) {
			fibonacci[i]=fibonacci[i-2]+fibonacci[i-1];
		}
		for(int i=0;i<20;i++) {
			System.out.print(fibonacci[i]+" ");
		}
		

	}
	
	// =========Method 1 - Recursive function======
	/*public static void fibonacci(int a, int b) {
		
		if(a==0 && b==1) {
			System.out.print(a +" "+b+" ");
		}
		int sum=a+b;
		if(sum<100) {
			System.out.print(sum+" ");
			a=b;
			b=sum;
			fibonacci(a,b);
		}
		
		
	}*/

}
