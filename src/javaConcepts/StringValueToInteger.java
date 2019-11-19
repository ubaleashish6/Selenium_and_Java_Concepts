package javaConcepts;

public class StringValueToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getStringInt("67"));

	}
	public static String getStringInt(String num){
		  try {
			Double num1=Double.valueOf(num);
			int intnum=num1.intValue();
			return new Integer(intnum).toString();
		} catch (Exception e) {
			return num;
		}
	}	  

}
