package javaCollection;

public class OccurenceOfSpecificChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello Lolly";
		char targetChar='l';
		
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


