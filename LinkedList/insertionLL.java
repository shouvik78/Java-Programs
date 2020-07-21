package LinkedList;

class Node1
{
	int data;
	Node1 next;
	Node1(int data)
	{
		this.data=data;
		this.next=null;
	}
}


public class insertionLL {
	
	static void print(Node1 head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	
	static Node1 insertAtHead(Node1 head, int data)
	{
		Node1 newNode= new Node1(data);
		newNode.next=head;
		head=newNode;
		//print(head);
		return head;
	}
	

	public static void main(String[] args) {
		{
			// TODO Auto-generated method stub
			Node1 head=new Node1(5);
			head.next=new Node1(6);
			head.next.next=new Node1(7);
			head.next.next.next=new Node1(8);
			head.next.next.next.next=new Node1(9);
			print(head);
			head=insertAtHead(head,4);
			print(head);
		}
	}

}
