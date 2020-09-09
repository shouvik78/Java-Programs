package sorting;

public class insertionSort {
	
	static void sort(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j + 1] = arr[j]; 
                j = j - 1;
			}
			arr[j+1]=key;
		}
				
	}
	
	static void display(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		 System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,12,12,1};
		sort(arr);
		display(arr);
	}

}
