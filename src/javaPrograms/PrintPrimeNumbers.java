package programs;

public class PrintPrimeNumbers {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime Numbers are: ");
		System.out.println(2);
		for(int i=2;i<50;i++) {
			int status=0;
			for(int j=i;j>0;j--) {
				//int status=0;
				if(i%j!=0) {
					
					status=1;
				}

				
			}
			if(status==1) {
				System.out.println(i);
			}
			
		}

	}*/
	/*public static void main (String[] args)
	   {		
	       int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
	          {
	             if(i%num==0)
	             {
	            	 counter = counter + 1;
	             }
	          }
	          if (counter ==2)
	          {
		     //Appended the Prime number to the String
	        	  primeNumbers = primeNumbers + i + " ";
	          }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }*/
	
	public static void main(String args[]){
/*		for(int i=1;i<=50;i++){
			int counter=0;
			for(int num=i;num>=1;num--){
				if(i%num==0){
					counter=counter+1;
				}
			}
			if(counter==2){
				System.out.print(i+" ");
			
		}*/
		
		//System.out.println('a'+'b');
		
		/*int a=10, b=15;
		if(++a<10 & ++b>15) {
			System.out.println(a++);
		}
		else {
			System.out.println(b++);
			System.out.println(b);
		}*/
		
		int a[]= {84,34,12,5,99};
		//int var;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]  +" ");
		}
	}

}
