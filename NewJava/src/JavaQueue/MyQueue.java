package JavaQueue;

import java.util.EmptyStackException;
import java.util.Queue;

class Node{
	int data;
	Node next;
	
//Constructor
	Node(int data){
		this.data=data;
		this.next=null;
	}
	
}
public class MyQueue {
	
	private Node front; // Points to the front of the queue (head)
	private Node last; // Points to the rear of the queue (tail)
	
	//constructor
	public MyQueue() {
		this.front=null;
		this.last=null;
	}
	// Method to check if the queue is empty
	
	public boolean isEmpty() {
		if(front==null) {
			return true;
		}
		else{ 
			return false;
		}
	}
//Method to enqueue (add) an element to the end of the queue
	
	public void enqueue(int data) {
		Node newNode= new Node(data); //create a new node with given data
		
//if the queue is empty, both front and rear point to the new node
		
		if(isEmpty()) {
			front = newNode;
			last = newNode;
		}
		else {
			last.next = newNode; //link the current last to the new node
			last=newNode; //update last to point new node
			
			
		}
	}
		
	
//method to dequeue(remove) an element from the front of the queue
	
	public int dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException("Que is empty. cannot dequeue");
			
		}
		int removed=front.data; //get the data from the front node
		
		front = front.next; //move front to the next node
		
		//If front becomes null, set last to null as well
		if(front==null) {
			last=null;
			
		}
		return removed;
	}
//Method to peek at the element at the front of the queue without removing it
	public int peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is empty. cannot peek");
			}
		return front.data;
		
	}
//method to print the element of the queue
	public void printQueue() {
		Node current = front;
		while(current !=null) {
			System.out.print(current.data +" ");
			current=current.next;
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		MyQueue queue = new MyQueue(); 
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println("Queue after enqueue operation:- ");
		queue.printQueue();
		
		//Dequeue element
		System.out.println( "deleted elemet:- "+queue.dequeue());
		
		//peek at the front element
		System.out.println("peeked element:- "+queue.peek()  );
		
		//print queue after peek & dequeue operation
		
		
		System.out.println("Queue after peek and dequeue operation:- ");
	
		queue.printQueue();
		
		
		

	}

}
