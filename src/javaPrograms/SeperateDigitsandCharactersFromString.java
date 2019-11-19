package programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeperateDigitsandCharactersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abde3434ccee33edfe3der3";
		
		/*String[] arr=str.split("(?=\\d)(?<!\\d)");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		Pattern p=Pattern.compile("\\D+");
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.print(m.group());
		}
		System.out.println(str.replaceAll("[^0-9]", ""));
		
		String[] arr=str.split("[0-9]");
		System.out.println(arr[0] +", "+arr[1]);*/
		
		
		//============another way=============
		
		String alpha="";
		String num="";
		for(char c:str.toCharArray()) {
			if(Character.isDigit(c)) {
				num=num+c;
			}
			else {
				alpha=alpha+c;
			}
		}
		System.out.println(alpha);
		System.out.println(num);

	}

}
