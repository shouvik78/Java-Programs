package trees;

class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
	}
}

public class BinaryTree {
	Node root;
	BinaryTree()
	{
		root=null;
	}
	
	BinaryTree(int data)
	{
		this.root=new Node(data);
	}
	
	int TreeSum(Node root)
	{
		if(root==null)
			return 0;
		return root.data+TreeSum(root.left)+TreeSum(root.right);
	}
	
	int countNodes(Node root)
	{
		if(root==null) return 0;
		return 1+countNodes(root.left)+countNodes(root.right);
	}
	
	int countLeaf(Node root)
	{
		if(root==null) return 0;
		if(root.left==null && root.right==null) return 1;
		
		return countLeaf(root.left)+countLeaf(root.right);
	}
	int height(Node root) 
    {
         if(root==null) return -1;
         return 1+Math.max(height(root.left),height(root.right));
    }
	
	void printLevel(Node root, int level)
	{
		if(root==null) return;
		if(level==0)
		{
			System.out.print(root.data+" ");
			return;
		}
		printLevel(root.left,level-1);
		printLevel(root.right,level-1);
	}
	
	void preorder(Node root)
	{
		if(root==null) return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	void inorder(Node root)
	{
		if(root==null) return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	void postorder(Node root)
	{
		if(root==null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	void bfsTrav(Node root)
	{
		
//		int height=height(root);
//		int levels=height+1;
		int levels=height(root)+1;
		System.out.println("-----Bfs-----");
		for(int i=0;i<levels;i++)
		{
			printLevel(root, i);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree b=new BinaryTree(2);
		b.root.left=new Node(3);
		b.root.right=new Node(5);
		b.root.left.right=new Node(9);
		b.root.right.left=new Node(7);
		System.out.println(b.TreeSum(b.root));
		//System.out.println(b.root.data);
		System.out.println(b.countNodes(b.root));
		System.out.println(b.countLeaf(b.root));
		System.out.print("height is ");
		System.out.println(b.height(b.root));
		b.printLevel(b.root, 2);
		System.out.println();
		System.out.print("preorder ");
		b.preorder(b.root);
		System.out.println();
		System.out.print("inorder ");
		b.inorder(b.root);
		System.out.println();
		System.out.print("postorder ");
		b.postorder(b.root);
		System.out.println();
		b.bfsTrav(b.root);
		
	}

}
