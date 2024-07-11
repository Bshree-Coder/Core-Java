package MyLinkedList;

//Define a node

 class Node {
	int data;
	Node next;

	
//constructor to initialize the node
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
	


 public class LinkedListCreator{
	static Node head;
// Function to create a linked list with n nodes where node values are from 1 to n
	public static Node createLinkedList(int n) {
		if(n<=0) {
			return null; //return null if non-positive value
			
		}
		Node n1=new Node(1); //create the head node with value 1
		Node current=n1;    //pointer to track the current node
		
//Loop to create subsequent nodes with values from 2 to n
		for(int i=2; i<=n;i++) {
			Node newNode=new Node(i); //create a new node with value i
			current.next=newNode; //Link the current node to the new node
			current=newNode; //,move the current pointer to the new node
		}
		return n1;
		}
	public static void printLinkedList(Node Head) {
		
		Node current=Head;
		while(current!=null) {
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}
public static void printList() {
		
		Node current=head;
		while(current!=null) {
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println("null");
	}
	//Write a function to insert a new node at the beginning of a singly linked list.
	public static Node insertAtFirst(int val) {
		Node n=new Node(val);
		n.next=head;
		head=n;
		return head;
		}
	public static void main(String[]args) {
		int n=5;
//		Node head=createLinkedList(n);//create the linked list
//		System.out.println("Linked list with values 1 to "+n+ ": ");
//		printLinkedList(head);
//		
//		Node head1=insertAtFirst(0);
//		//insertAtFirst(0);
//		printLinkedList(head1);
		 LinkedListCreator n1=new LinkedListCreator();
		 
		 n1.head=new Node(1);
			Node n2=new Node(3);
			Node n3=new Node(5);
			Node n4=new Node(7);
			Node n5=new Node(9);
			n1.head.next=n2; 
			n2.next=n3;
			n3.next=n4;
			n4.next=n5;
			n1.printList();
		n1.insertAtFirst(0);
		n1.printList();
	}
	
}


