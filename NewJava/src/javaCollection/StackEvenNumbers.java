package javaCollection;

import java.util.Stack;

public class StackEvenNumbers {

	public static void main(String[] args) {
		 Stack<Integer> sc = new Stack<>();
	        
	       
	        int[] evenNumbers = {1,2,3, 4,5, 6, 7,8,9, 10};
	        
	        
	        
	        System.out.println("Stack after each push: ");
	       
	        for (int num : evenNumbers) {
	            if (num % 2 == 0) {
	                sc.push(num);
	                System.out.println(sc);
	            }
	        }
	    }
	}
		