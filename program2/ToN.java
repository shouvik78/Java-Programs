package program2;

public class ToN {
	
	static void toN(int n)
	{
		if(n>0)
		{
			System.out.print(n  +" ");
			toN(n-1);
//			System.out.print(n+ " ");
		}
		
		System.out.print(n+ " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toN(5);
	}

}
