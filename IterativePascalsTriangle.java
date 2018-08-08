import java.util.Scanner;

/*
/* Solving Pascals triangle for n
 * 
 * @author: John Stranahan
 * @version: 2017.10.30
 *
 * 
 */
public class IterativePascalsTriangle
{

	public static void main(String[] args)
	{
		
		System.out.println("Pascals Triangle - How many rows do you want to solve ?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		System.out.println("");
		pascalsTriangle(n-1);
		
		
	} // end Main
	
	
	public static void pascalsTriangle(int n)
	{
		
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
				if(i==j)
				{
					System.out.println(pascals[i][j]+" ");
				}
				else
					System.out.print(pascals[i][j]+" ");
				
			}
				
			
		 }
	

		 
		
		
		
		
		
	} // end pascalsTraingle
	
	
	
	
	
	
	
	
	
} // end CLASS
