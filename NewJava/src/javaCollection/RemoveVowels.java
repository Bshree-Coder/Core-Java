package javaCollection;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Bhagyashri Korde";
		
//		String modifiedStr= str.replaceAll("[aeiouAEIOU]"," ");
//		
//		System.out.println("Original String is: "+str);
//		System.out.println("String without vowel is: " +modifiedStr);
//	
//	}
//
//}
//__________________________________________________________________________________________________

             //Using Iteration and StringBuilder
           


            StringBuilder sb = new StringBuilder();

           for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
    
    
                  if (!isVowel(ch)) {
                        sb.append(ch);
    }
}


              String modifiedStr = sb.toString();


                 System.out.println("Original string: " + str);
                  System.out.println("String without vowels: " + modifiedStr);
}


                   public static boolean isVowel(char ch) {
                        return "aeiouAEIOU".indexOf(ch) != -1;
}
}
