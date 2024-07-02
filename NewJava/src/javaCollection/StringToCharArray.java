package javaCollection;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Hello World";
		char[] charArray=str.toCharArray();
		for (int i=0;i<charArray.length;i++)
		{
			System.out.println("Character at index " + i + ": " + charArray[i]);
		}
	
	}

}
