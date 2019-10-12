package javaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=786643;
		int revNumber=0;
		while(num>0){
			int rem=num%10;
			revNumber=revNumber*10+rem;
			num=num/10;
		}
		System.out.println(revNumber);

	}

}
