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

public class myLL {
	static void traverse(Node head)
	{
		while(head!=null)
		{
		System.out.print(head.data+ " ");
		head=head.next;
		}
		System.out.println();
	}
	static Node insertAtHead(Node head, int data)
	{
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
		return head;
	}
	
	static Node insertAtEnd(Node head, int data)
	{
		Node newnode=new Node(data);
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
			
		}
		temp.next=newnode;
		return head;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=null;
		head=insertAtHead(head,1);
		traverse(head);
		
		insertAtEnd(head,2);
		insertAtEnd(head,3);
		insertAtEnd(head,4);
		insertAtEnd(head,5);
		traverse(head);
		
	}

}
