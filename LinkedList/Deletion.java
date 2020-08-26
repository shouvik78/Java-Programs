package LinkedList;

class Node2
{
	int data;
	Node2 next;
	Node2(int data)
	{
		this.data=data;
		this.next=null;
		
	}
}


public class Deletion {
	
	static void printt(Node2 head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;	
		}
		System.out.println();
		
	}
	
//	static Node2 deletell(Node2 head)
//	{
//		head=null;
//		return head;
//	}
	
	static Node2 deleteFromHead(Node2 head)
	{
		if(head.next==null)
		{
			return null;
		}
		head=head.next;
		return head;
	}
	
	static Node2 deleteN(Node2 head)
	{
		Node2 temp=head;
		while(temp.next.next!=null)
			temp=temp.next;
			temp.next=null;
			return head;
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-gener

		Node2 head=new Node2(5);
		head.next=new Node2(6);
		head.next.next=new Node2(7);
		head.next.next.next=new Node2(8);
		head.next.next.next.next=new Node2(9);
		printt(head);
//		head1=deletell(head1);
//		printt(head1);
//		head=deleteFromHead(head);
//		printt(head);
        head=deleteN(head);
        head=deleteN(head);
        printt(head);
	}

}
