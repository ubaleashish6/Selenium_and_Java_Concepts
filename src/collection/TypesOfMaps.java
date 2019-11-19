package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TypesOfMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<String, String> map=new HashMap<>();
		//Map<String, String> map=new LinkedHashMap<>();
		Map<String, String> map=new TreeMap<>();
		map.put("One", "Human");
		map.put("Two", "Two");
		map.put("Three", "Three");
		map.put("Four", "Four");
		map.put("Five", "Five");
		map.put("Six", "Six");
		map.put("Seven", "Seven");
		
		//map.
		
		for(String key: map.keySet()) {
			System.out.println("Key- "+key);
		}
		for(String val: map.values()) {
			System.out.println("Key- "+val);
		}
		//System.out.println(map.get("One"));

	}//9421823370

}
