package programs;

public class decoToOcta {
	
	static void toHexa(int n)
	{
		 int rem;
		 
		    String str=""; 
		 
		    char dit[]={'0','1','2','3','4','5','6','7'};
		 
		    while(n>0)
		    {
		       rem=n%8; 
		       str=dit[rem]+str; 
		       n=n/8;
		    }
		    System.out.println(str);
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		toHexa(n);
	}

}
