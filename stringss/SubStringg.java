package stringss;
import java.util.*;

public class SubStringg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println(s.substring(start, end));
	}

}
