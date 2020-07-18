package Arrays;

public class passingArray {

	static void addOne(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		addOne(arr);
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
