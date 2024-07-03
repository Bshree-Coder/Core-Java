package javaCollection;
//5.0 How can you count the number of occurrences of a specific character in a string?
public class OccurenceOfSpecificChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Hello Lolly";
		char targetChar='l';
		String str= str1.toLowerCase();
		
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==targetChar) {
				count++;
			}
		}
		System.out.println("Occurence of"+ "  " +targetChar+ "in the string is"+ ": " +count);
		}
		

	}


