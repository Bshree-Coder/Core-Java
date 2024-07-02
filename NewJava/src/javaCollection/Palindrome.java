package javaCollection;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Madam";
		String s2="Hello";
	
		
		
	System.out.println("'" + s1 + "' is a palindrome: " + isPalindrome(s1));
    System.out.println("'" + s2 + "' is a palindrome: " + isPalindrome(s2));
}
	
	public static boolean isPalindrome(String str) {
		
		str=str.toLowerCase();
		 
		
		int left=0;
		int right=str.length()-1;
		while(left < right) 
		{
			while(left< right && !Character.isLetterOrDigit(str.charAt(left)))
			{
				left++;
			}
			while(left<right && !Character.isLetterOrDigit(str.charAt(right)))
			{
				right--;
			}
			
			 if (str.charAt(left) != str.charAt(right)) {
	                return false; 
	            }
	            
	            
	            left++;
	            right--;
	        }
	        
	        return true; 
		}
		
	}

		

