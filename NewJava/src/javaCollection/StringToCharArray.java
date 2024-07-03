package javaCollection;
//3.0 How can you convert a string to a character array in Java?
public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Hello World";
		char[] charArray=str.toCharArray();
		System.out.println(str.contains("r"));
		for (int i=0;i<charArray.length;i++)
		{
			System.out.println("Character at index " + i + ": " + charArray[i]);
		}
	
	}

}
