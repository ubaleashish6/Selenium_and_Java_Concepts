package arraysConcepts;

public class SingleDimensionalReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc[]=getValues();
		System.out.println(abc[0] +" "+abc[1]);

	}
	
	public static String[] getValues(){
		String a="aaaaa";
		String b="bbbbb";
		return new String[]{a,b};
	}

}
