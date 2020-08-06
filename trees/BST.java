package trees;
class Node1
{
	int data;
	Node1 left;
	Node1 right;
	Node1(int data)
	{
		this.data=data;
	}
}
public class BST {
	Node1 root;
	BST()
	{
		root=null;
	}
	 BST(int data)
	 {
		 this.root=new Node1(data);
	 }
	  Node1 search(Node1 root, int data)
	  {
		  if(root==null) return null;
		  if(root.data==data) return root;
		  if(root.data>data)
		  {
			  return search(root.left,data);
		  }
		  else
		  {
			  return search(root.right,data);
		  }
	  }
	  
	  boolean ifNodePresent(Node1 root, int data)
	  {
		  if(root==null)
		  {
			  return false;
		  }
		  while(root!=null)
		  {
			  if(data==root.data)
			  {
				  return true;
			  }
			  else if(data>root.data)
			  {
				  root=root.left;
			  }
			  else
			  {
				  root=root.right;
			  }
		  }
		  return false;
	  }
	  Node1 insert(Node root, int data)
	  {
		  if(root==null)
			  return new Node1(data);	 
		  
	  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst= new BST();
		
		
	}

}
