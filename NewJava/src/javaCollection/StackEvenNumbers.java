package javaCollection;

import java.util.Stack;

public class StackEvenNumbers {

	public static void main(String[] args) {
		 Stack<Integer> sc = new Stack<>();
	        
	       
	        int[] evenNumbers = {2, 4, 6, 8, 10};
	        
	        
	        
	        System.out.println("Stack after each push: ");
	       
	        for (int num : evenNumbers) {
	            if (num % 2 == 0) {
	                sc.push(num);
	                System.out.println(sc);
	            }
	        }
	    }
	}
		