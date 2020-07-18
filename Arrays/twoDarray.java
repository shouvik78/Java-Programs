package Arrays;

public class twoDarray {

	public static void main(String[] args) {
		
		int arr[][]=new int[5][3];
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+1+" ");
			}
			System.out.println();
		}
	}

}
