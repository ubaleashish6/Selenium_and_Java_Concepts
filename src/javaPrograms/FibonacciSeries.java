package javaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st way--------------------
		/*int a= 0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=20;i++){
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}*/
		
		//2nd way i.e recursion--------------------
		FibonacciSeries ob=new FibonacciSeries();
		ob.printFibonacci(0,1);

	}
	public void printFibonacci(int n1, int n2){
		//int sum=0;
		if(n1==0){
			System.out.print(n1+ " "+n2+" ");
		}
		int sum=n1+n2;
		
		if(sum<100){
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
			printFibonacci(n1,n2);
		}
	}

}
