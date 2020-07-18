package Arrays;

public class first 
{
	

	public static void main(String[] args)
	{
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			arr[i]=i+1;
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int a[]= {1,2,3,4};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
