package Dp;

public class stairDp {
	static int stairRec(int n)
	{
		if(n==0) return 1;
		if(n==1 || n==2) return n;
		return stairRec(n-1)+stairRec(n-2)+stairRec(n-3);
	}
	static int stair(int n)
	{
		int store[]=new int[n+1];
		store[0]=1;
		store[1]=1;
		store[2]=2;
		for(int i=3;i<=n;i++)
		{
			store[i]=store[i-1]+store[i-2]+store[i-3];
		}
		return store[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=35;
		System.out.println(stair(n));
		System.out.println(stairRec(n));
		
	}

}
