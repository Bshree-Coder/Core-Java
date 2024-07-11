package JavaArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MyArrayList {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//How do you create an `ArrayList` of `String` type in Java?
		
		ArrayList<String> al=new ArrayList<String>();
	
//How do you add an element to an `ArrayList` in Java?
		
		al.add("Bhagyashri");
		al.add("Ajinkya");
		al.add("Chanda");
		al.add("Komal");
		al.add("Rani");
//How do you remove an element from an `ArrayList` by its index?
	
//		al.remove(2);
//		System.out.println("ArrayList after removing element at index 2: "+al);
		
//How can you retrieve an element from an `ArrayList` using its index?
		
		String firstElement=al.get(0);
		String secondElement=al.get(1);
		String thirdElement=al.get(2);
		
		System.out.println("First Element: "+firstElement );
		System.out.println("Second Element: "+secondElement);
		System.out.println("Third Element: "+thirdElement);

//How do you find the size of an `ArrayList`?
		
		System.out.println("Size of the ArrayList: "+al.size());

//How can you remove all elements from an `ArrayList`?		
		
		//System.out.println(al.removeAll(al));
		
//How do you check if an `ArrayList` contains a specific element?		
		
		System.out.println(al.contains(firstElement));
		
//	How do you iterate over all elements in an `ArrayList` using a for-each loop?	
		
		System.out.println("Elements in the Array list: ");
		
		for (String element:al) {
			System.out.println(element);
		}
//How do you convert an `ArrayList` to an array?
		
		 String[] array = al.toArray(new String[0]);
	        System.out.print("Array converted from ArrayList: ");
	        for (String element : array) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	Collections.sort(al);
	System.out.println("ArrayList after sorting: "+al);
}
	
}
