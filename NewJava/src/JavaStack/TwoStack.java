package JavaStack;
/*Write a Java program to create two stacks. Push the elements 1, 2, and 3 onto the first stack and the 
elements 4, 5, and 6 onto the second stack. Print both stacks.*/
import java.util.Stack;

public class TwoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s1= new Stack<>();
		
		Stack<Integer> s2=new Stack<>();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		
		s2.push(4);
		s2.push(5);
		s2.push(6);
		
		while(!s2.empty()) {
	    int a=s2.peek();
			if(a%2==0) {
				s1.push(a);
				
			}
			s2.pop();
		}
		
			
		
		
	System.out.println("Stack 1: "+s1);
	System.out.println("Stack 2: "+s2);
	}
}
