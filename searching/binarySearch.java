package searching;
import java.util.*;

public class binarySearch {
	static int binaryy(int arr[], int l, int r, int key)
	{
		if(l>r)
			return -1;
		int mid=(l+r)/2;
//		for( int i =0; i<5; i++)
//		{
//			System.out.println("arr");
//			System.out.println(arr[i]);
//		}
		if(arr[mid]==key)
		{
			return mid;
		}
		else if(key>arr[mid])
		{
			return binaryy(arr,mid+1,r,key);
		}
		else
		{
			return binaryy(arr,l,mid-1,key);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the values of array");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the values of key");
		int key=sc.nextInt();
		int indx = 0;
//		int arr[]= {1,2,3,4,5,6};
//		int key=7;
		indx = binaryy(arr,0,arr.length-1,key);
		System.out.println("index= " +indx);
	}

}
