package JavaStack;
/*Write a Java program to create a stack, push the elements 'A', 'B', 'C' onto it, and then clear
the stack. Print the stack before and after clearing.*/

/*Write a Java program to create a stack, push the elements 'X', 'Y', and 'Z' onto it, and then
 *  search for the element 'Y' in the stack.*/
import java.util.Stack;

public class StackCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack sc=new Stack();
//		
//		sc.push('X');
//		sc.push('Y');
//		sc.push('Z');
//		
//		System.out.println(sc.contains('Y'));
		
		sc.push('A');
		sc.push('B');
		sc.push('C');
		
		System.out.println(sc);
		sc.clear();
		System.out.println(sc);

	}

}
