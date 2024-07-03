package javaCollection;
//2.0 How do you check if a string contains a specific substring?
public class StringContainsSubstring {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using contains method
		
		String mainStr="Hello World";
		String subString="World";
		
//		boolean contains= mainStr.contains(subString);
//		if(contains) {
//			System.out.println("The string contains the substring" + " " +subString);
//			
//		}
//		else {
//			System.out.println("The string does not contain substring" + subString);
//		}
//
//	}
//
//}
//----------------------------------------------------------------------------------------
                           //Using indexOf method
int index=mainStr.indexOf(subString);
if(index!=-1) {
	System.out.println("The string contains the substring"+ " " + subString);
	
}
else {
	System.out.println("The string does not containg substring" + " " +subString);
}
	}
}
