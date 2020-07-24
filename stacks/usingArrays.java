package stacks;
import java.util.*;

class mystack
{
	final int size=10;
	int arr[]=new int[size];
	int top=-1;
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		return false;
	}
	int peek()
	{
		return arr[top];
	}
	void push(int data)
	{
		top++;
		arr[top]=data;
	}
	int pop()
	{
		int x=arr[top];
		top--;
		return x;
	}
}

public class usingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mystack s=new mystack();
		System.out.println(s.isEmpty());
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.isEmpty());
		for(Integer x:s.arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
	}

}
