package LinkedList;

class Node3
{
	int data;
	Node3 next;
	Node3(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}
public class TraverseLL {

	static void print(Node3 head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	static Node3 reverse(Node3 head)
	{
		Node3 curr=head;
		Node3 prev=null;
		Node3 next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		return prev;
	}
//	static boolean detectloop(Node3 head)
//	{
//		Node3 slow=head;
//		Node3 fast=head;
//		while(fast!=null && fast.next!=null)
//		{
//		slow=slow.next;
//		fast =fast.next.next;
//		if(slow==fast)
//		{
//			return true;
//		}
//		}
//			return false;
//	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Node3 head=new Node3(5);
		head.next=new Node3(63);
		head.next.next=new Node3(7);
		head.next.next.next=new Node3(8);
		head.next.next.next.next=new Node3(9);
		head.next.next.next.next.next=head.next;
		print(head);
		head=reverse(head);
		print(head);
//		if(detectloop(head))
//			System.out.println("true");
//		else
//			System.out.println("false");
	}
}
