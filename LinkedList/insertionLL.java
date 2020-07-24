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
	
	static Node1 insertAtEnd(Node1 head, int data)
	{
		if(head==null)
		{
			Node1 newNode=new Node1(data);
			head=newNode;
			return head;
		}
		Node1 newNode=new Node1(data);
		while(head.next!=null)
		{
			head=head.next;
		}
		head.next=newNode;
		return head;
	}
	
	static void insertAtn(Node1 head, int data, int pos)
	{
		if(pos==1)
		{
			Node1 newNode= new Node1(data);
			head=newNode;
		}
		Node1 newNode=new Node1(data);
		Node1 temp=head;
		for(int i=0;i<pos-2;i++)
		{
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	static Node1 DeleteAll(Node1 head)
	{
		head=null;
		return head;
	}
	

	public static void main(String[] args) {
		{
			Node1 head=new Node1(5);
			insertAtEnd(head,1);
			insertAtEnd(head,2);
			insertAtEnd(head,3);
			insertAtEnd(head,4);
			
			print(head);
			head=insertAtHead(head,4);
			print(head);
			insertAtEnd(head,10);
			print(head);
			insertAtn(head,9,4);
			insertAtn(head,20,2);
			print(head);
			head=DeleteAll(head);
			print(head);
		}
	}

}
