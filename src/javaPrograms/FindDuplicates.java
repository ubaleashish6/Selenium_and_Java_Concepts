package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<=10;i++){
			list.add(String.valueOf(i));
		}
		for(int i=0;i<=5;i++){
			list.add(String.valueOf(i));
		}
		System.out.println("Input List: "+list);
		System.out.println("\nFiltered Duplicates: "+processedList(list));

	}
	public static Set<String> processedList(List<String>listContainingDuplicates){
		
		Set<String> resultSet=new HashSet<String>();
		Set<String> tempSet=new HashSet<String>();
		for(String yourInt:listContainingDuplicates){
			if(!tempSet.add(yourInt)){
				resultSet.add(yourInt);
			}
		}
		return resultSet;
	}

}
