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
		System.out.println();
	}
	static Node reverse(Node head)
	{
		Node curr=head;
		Node prev=null;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
	static boolean detectloop(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
		slow=slow.next;
		fast =fast.next.next;
		if(slow==fast)
		{
			return true;
		}
		}
			return false;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Node head=new Node(5);
		head.next=new Node(6);
		head.next.next=new Node(7);
		head.next.next.next=new Node(8);
		head.next.next.next.next=new Node(9);
		head.next.next.next.next.next=head.next;
		print(head);
		head=reverse(head);
		print(head);
		if(detectloop(head))
			System.out.println("true");
		else
			System.out.println("false");
	}
}
