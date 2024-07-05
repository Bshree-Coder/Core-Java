package JavaStack;
//Write a Java program to create a stack. Push only even numbers (2, 4, 6, 8, 10) onto the stack. Print the stack after each push.*/
import java.util.Stack;

public class StackEvenNumbers {

	public static void main(String[] args) {
		 Stack<Integer> sc = new Stack<>();
	        
	       
	        int[] evenNumbers = {1,2,3, 4,5, 6, 7,8,9, 10};
	        
	        
	        
	        System.out.println("Stack after each push: ");
	       
	        for (int num : evenNumbers) {
	            if (num % 2 == 0) {
	                sc.push(num);
	               
	        }
	    }
	        System.out.println(sc);
    }
	}
		