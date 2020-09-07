package sorting;

public class SelectionSort {
	static void selection(int arr[])
	{
		int n=arr.length;
		int i,j;
		for(i=0;i<n-1;i++)
		{
			int min=i;
			for(j=i+1;j<n;j++)
				if(arr[j]<arr[min])
					min=j;
			
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
	}
	static void display(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		
			System.out.print(arr[i]+" ");
			System.out.println();
		
	}

	public static void main(String[] args) {
		
		int arr[]= {64,25,12,22,11};
		selection(arr);
		System.out.print("Sorted array is:"+" ");
		display(arr);
	}

}
