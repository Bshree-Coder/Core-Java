package javaCollection;

public class FormatString {
	private static final Object Name = null;
	private static final Object Age = null;
	private static final Object Height = null;

	public static void main(String[]args) {
		
		
		// Using String.format()
		
		String name="Shree";
		int age=28;
		double height=165.5;
		//String formatedString=String.format("name:%s, Age:%d, Height:%.2f", name,age,height);
		//System.out.println(formatedString);
	//}

//}

//_____________________________________________________________________________________________
             //Using system.out.printf
System.out.printf("Name:%s, Age:%d, Height:%.2f\n", name,age,height);
}
}