package javaCollection;
//7.0 How can you compare two strings lexicographically in Java?
public class CompareStringsLexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using compareTo() method
		
		String s1="Apple";
		String s2="Banana";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
//		int result=s1.compareTo(s2);
//		if(result<0) {
//			System.out.println( " ' " +s1+ " comes before " +s2+ " '.");
//			
//		}
//		else if(result>0) {
//			System.out.println(s1 + " comes after "+ s2);
//		}
//		else {
//			System.out.println(s1 +"and" +s2+ "are equal");
//		}
//	}
//
//}
//________________________________________________________________________________________________

            //Using compareToIgnoreCase() method

//int result=s1.compareToIgnoreCase(s2);
//if(result<0) {
//	System.out.println( " ' " +s1+ " comes before " +s2+ " '.");
//	
//}
//else if(result>0) {
//	System.out.println(s1 + " comes after "+ s2);
//}
//else {
//	System.out.println(s1 +"and" +s2+ "are equal");
//}
//}
//
//	
}
}







