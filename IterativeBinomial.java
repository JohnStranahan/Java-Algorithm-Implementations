import java.util.Scanner;

/* 
 * Binomial Coefficient Solver
 * The binomial coefficient (n; k) is the number of ways of picking k unordered outcomes from n possibilities
 * 
 * Submitted:  10/31/17
 * 
 * @author: John Stranahan
 * @version: 2017.10.30
 *
 * 
 */
public class IterativeBinomial 
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
	
	public static int iterBinomial(int n, int k)
	{
		
		int result = 0;
		int[][] pascals = new int[n+1][];
		 for (int i = 0 ; i <= n; i++)
		 {
			 
			pascals[i] = new int[i+1];
			for (int j = 0; j <= i; j++) 
			{
			
				
				if(i==j || j == 0)
				{
					pascals[i][j] = 1;
					
					
				}
				else
				{
					pascals[i][j] = (pascals[i-1][j] + pascals[i-1][j-1]);
					
				}
				
				if(i==n && j == k)
				{
					result = pascals[i][j];
				}
			}
		 }
		 return result;
	}
	
	
	
	
}
