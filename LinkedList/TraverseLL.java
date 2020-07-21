package LinkedList;

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}
public class TraverseLL {

	static void print(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Node head=new Node(5);
		head.next=new Node(6);
		head.next.next=new Node(7);
		head.next.next.next=new Node(8);
		head.next.next.next.next=new Node(9);
		print(head);
	}
}
