package javaCollection;

public class StringToInteger {
//1.0 How can you convert a string to an integer in Java and handle possible exceptions?
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="A";
try {
	int n=Integer.parseInt(s);
	System.out.println("Converted Integer is: "  + n);
}
catch(NumberFormatException e) {
	//System.out.println("Error: cannot convert the string to an integer");
	System.out.println(e.getMessage());
	//e.printStackTrace();
	
	
}
	}

}
