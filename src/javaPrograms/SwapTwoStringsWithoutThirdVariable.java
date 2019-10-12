package javaPrograms;

public class SwapTwoStringsWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Ashish213";
		String b="ubale";
		
		System.out.println("Strings before swapping: "+a +","+b);
		a=a+b;
		//System.out.println(a);
		//System.out.println(a.substring(a.length()));
		//System.out.println(a.length()-b.length());
		b=a.substring(0,(a.length()-b.length()));
		//System.out.println(b);
		a=a.substring(b.length());
		//System.out.println(a);
		System.out.println("Strings after swapping: "+a +","+b);
		//System.out.println(a.substring(0,(a.length()-b.length())));
	}

}
