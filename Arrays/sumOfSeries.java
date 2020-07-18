package Arrays;
import java.util.*;

public class sumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int sum=0;
		while(t-->0)
		{
		    int n=sc.nextInt();
		    for(int i=1;i<=n;i++)
		    {
		        sum=sum+i;
		    }
		    System.out.println(sum);
		}
	}

}
