package programs;
import java.util.*;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			
				count++;
			
		}
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
