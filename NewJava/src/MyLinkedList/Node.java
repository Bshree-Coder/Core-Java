package MyLinkedList;

//Define a node
public class Node {
	int data;
	Node next;

	
//constructor to initialize the node
	Node(int data){
		this.data=data;
		this.next=null;
	}
	


public class LinkedListCreator{
	
// Function to create a linked list with n nodes where node values are from 1 to n
	public static Node createLinkedList(int n) {
		if(n<=0) {
			return null; //return null if non-positive value
			
		}
		Node head=new Node(1);//create the head node with value 1
		Node current=head; //pointer to track the current node
		
		//Loop to create subsequent nodes with values from 2 to n
		for(int i=2; i<=n;i++) {
			Node newNode=new Node(i); //create a new node with value i
			current.next=newNode; //Link the current node to the new node
			current=newNode; //,move the current pointer to the new node
		}
		return head;
		}
	public static void printLinkedList(Node Head) {
		//Node head = null;
		Node current=Head;
		while(current!=null) {
			System.out.println(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[]args) {
		int n=5;
		Node head=createLinkedList(n);//create the linked list
		System.out.println("Linked list with values 1 to "+n+ ": ");
		printLinkedList(head);
	}
}
}

