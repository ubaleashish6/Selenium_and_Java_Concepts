package javaPrograms;

import java.util.Arrays;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.println("Unsorted list: ");
		showList(array);
		Arrays.sort(array);
		System.out.println("Sorted list: ");
		showList(array);
		Arrays.sort(array,String.CASE_INSENSITIVE_ORDER);
		System.out.println("Sorted list in case sensetive order: ");
		showList(array);

	}
	public static void showList(String array[] ){
		
		for(String val: array){
			System.out.print(val+ " ");
		}
		System.out.println();
	}
	

}
