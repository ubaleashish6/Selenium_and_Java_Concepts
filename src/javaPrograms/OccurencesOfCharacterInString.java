package javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurencesOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="my name is mama sudhakar ubale";
		freqCount(str);
		//str=str.replace(" ", "");
		
		//=======Solution1===============================
		
		/*Map<Character, Integer> occurences=new LinkedHashMap<>();
		for(char c: str.toCharArray()){
			
			if(occurences.containsKey(c)){
				occurences.put(c, (Integer)occurences.get(c)+1);
			}
			else{
				occurences.put(c, 1);
			}
			
		}
		System.out.println(occurences);
		for(Map.Entry<Character, Integer> entry:occurences.entrySet()){
			System.out.println("Character: "+entry.getKey()+" And Ocurrences are: "+entry.getValue());
		}*/

	}
	public static void freqCount(String str){
		str=str.replace(" ", "");
		while(str.length()>0){
			char ch=str.charAt(0);
			int charCount=countChar(str, ch);
			System.out.println(ch + " " + charCount); 			
			str=str.replace(""+ch, "");
		}
	}
	public static int countChar(String str, char ch){
		int count=0;
		while(str.indexOf(ch)!=-1){
			int index=str.indexOf(ch);
			count++;
			str=str.substring((str.indexOf(ch)+1));
		}
		return count;
	}

}
