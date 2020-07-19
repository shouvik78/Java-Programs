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

	void print(Node head)
	{
		System.out.println(head.data +" ");
		head=head.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(1);
		while(head!=null)
		{
			System.out.println(head.data+ " ");
		}
	}

}
