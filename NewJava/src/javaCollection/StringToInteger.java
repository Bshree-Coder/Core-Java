package javaCollection;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="123";
try {
	int n=Integer.parseInt(s);
	System.out.println("Converted Integer is: "  + n);
}
catch(NumberFormatException e) {
	System.out.println("Error: cannot convert the string to an integer");
}
	}

}
