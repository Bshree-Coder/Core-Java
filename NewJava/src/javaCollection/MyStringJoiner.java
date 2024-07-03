package javaCollection;

import java.util.StringJoiner;
//10.0 How do you join an array of strings into a single string with a delimiter in Java?
public class MyStringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using stringJoiner()
		
		String[] array= {"Java", "is","awesome","language"};
		String delimeter="";
		StringJoiner joiner =new StringJoiner(delimeter);
		for(String str : array) {
			System.out.println(joiner.toString());
			joiner.add(str);
			
		}
		String joinedString = joiner.toString();
		System.out.println("Joined string: "+ joinedString);
		

	}

}
