package javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ExtractDuplicateWordsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My name is Ashish Ubale and my wife name is Ragini ubale";
		
		findDuplicateWords(str);
		

	}
	public static void findDuplicateWords(String str){
		
		String[] words=str.split(" ");
		
		Map<String, Integer> wordMap=new LinkedHashMap<>();
		for(String word: words){
			if(wordMap.containsKey(word)){
				wordMap.put(word.toLowerCase(), wordMap.get(word.toLowerCase())+1);
			}
			else{
				wordMap.put(word.toLowerCase(), 1);
			}
		}
		Set<String> wordSet=wordMap.keySet();
		for(String word:wordSet){
			System.out.println(word+"-"+wordMap.get(word));
		}
		
		
	}

}
