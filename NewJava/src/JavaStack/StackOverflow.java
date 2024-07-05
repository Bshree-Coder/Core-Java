package JavaStack;

import javax.swing.tree.FixedHeightLayoutCache;

/*Write a Java program to create a stack with a fixed capacity of 5. Push the elements
 *  1, 2, 3, 4, 5, and 6 onto it. Check for stack overflow and print an appropriate message if it occurs.*/
public class StackOverflow {

	
		// TODO Auto-generated method stub

		private int[] stack;
		private int top;
		private int capacity;
		public StackOverflow(int capacity) {
			this.capacity=capacity;
			stack=new int[capacity];
			top=-1;
		}
		public void push(int element) {
			if(top==capacity-1) {
				System.out.println("Stack overflows: Cannot push element "+element+". Stack is full.");
				
				return;
			
			}
			stack[++top]=element;
			System.out.println("Pushed elemet "+element+ " onto the stack. ");
		}
		public void printstack() {
			for(int i=0;i<=top;i++) {
				System.out.println(stack[i]+ " ");
			}
			System.out.println();
		
		}
		public static void main(String[] args) {
			StackOverflow stack=new StackOverflow(5);
			stack.push(1);
			stack.printstack();
			stack.push(2);
			stack.printstack();
			stack.push(3);
			stack.printstack();
			stack.push(4);
			stack.printstack();
			stack.push(5);
			stack.printstack();
			stack.push(6);
			stack.printstack();
	}

}
