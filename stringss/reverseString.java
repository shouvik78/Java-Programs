package stringss;

public class reverseString {

	public static void main(String[] args) {
		String s="ShouvikGhosh";
		char arr[]=s.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}

}
