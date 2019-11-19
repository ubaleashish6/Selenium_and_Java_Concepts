package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TypesOfSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set=new HashSet<>();
		//Set<String> set=new LinkedHashSet<>();
		//Set<String> set=new TreeSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Six");
		set.add("Seven");
		set.add("Eight");
		set.add("Nine");
		
		for(String val: set) {
			System.out.println(val);
		}

	}

}
