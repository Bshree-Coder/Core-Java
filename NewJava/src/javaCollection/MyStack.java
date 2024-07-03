package javaCollection;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack sc=new Stack();
		
		sc.push("Bhagya");
		sc.push('B');
		sc.push(1900);
		sc.push(1991);
		sc.push(1992);
		sc.push(1995);
		sc.push(true);
		sc.push(20.25f);
        sc.push(23876554356739l);
		
		
		sc.pop();
	    sc.pop();
	    
		System.out.println(sc.peek());
		System.out.println(sc);
		System.out.println(sc.size());
		System.out.println(sc.isEmpty());
		
}
}
