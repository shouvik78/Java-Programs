package HackerRank;
import java.util.Scanner;

public class tableofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
		int N=sc.nextInt();
		//String s=sc.nextLine();
		int result=1;
		for(int i=1;i<=10;i++)
		{
		result=N*i;
		System.out.printf("%d x %d = %d \n", N, i, result);
		}
		System.out.println("String=" +s);
	}

}
