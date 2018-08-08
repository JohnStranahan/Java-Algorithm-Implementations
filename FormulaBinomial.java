
/*
 * 
 * @author: John Stranahan
 * @version: 2017.10.30
 *
 * 
 */
public class FormulaBinomial 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter N");
		int n = sc.nextInt();
		System.out.println("Please Enter K");
		int k = sc.nextInt();
		
		System.out.println(iterBinomial(n,k));
	}
	
	
	public static int formBinomial(int n, int k)
	{
		int result = 1;
		int bottom = 1;
		 
		
		if(k >= (n-k))
		{
				bottom = rFactorial(1,n-k);    // falling factorial   (n-k)!
			
			for(int i = (k+1); i <= n; i++)  //k +1 to n
			{
				result *= i;
			}
			
			result = result/bottom;
		}
		else if (n-k > k)
		{
			bottom = rFactorial(1,k);   // falling factorial k!
			
			for(int i = (n-k+1); i <= n; i++) // n-k+1 to n
			{
				result *= i;
			}
			
			result= result/bottom;
		}
		
		
		return result;		
		
		
	}
	
	public static int rFactorial(int n, int k)  // initial factorial method modified to falling factorial
	{ 	
		int result = 1;

			while(n <= k)
			{
				result *= n;
				n++;
			}
			return result;
			
	} ///////////////END rFib////////////////// 
	
	
	
}

