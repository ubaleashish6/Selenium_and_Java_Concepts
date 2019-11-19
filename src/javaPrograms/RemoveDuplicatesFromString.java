package programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(removeDuplicates("aabbccdefatafaz"));
		
		//=====One way==============
		
		/*String string = "aabbccdefatafaz";

		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());*/
        //===================================
	}
	/*public static void removeDuplicates(String str) {
		
		//int count=0;
		String output=new String();
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			for(int j=1;j<str.length();j++) {
				char b=str.charAt(j);
				if(a!=b) {
					output=output+str.charAt(i);
				}	
			}
		}
		System.out.println(output);
	}*/
	public static String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}

}
