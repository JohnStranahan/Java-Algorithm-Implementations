/**
 * John Stranahan
 * Recurisve Towers of Hanoi Solver
 */

import java.util.Scanner;

public class RecursiveTowersOfHanoi {

	 public static int n;
	 public static int diskMoves;
	 public static int methodCalls;
	 static String I = "Initial";
	 static String D = "Destination";
	 static String T = "Temporary";


	public RecursiveTowersOfHanoi(int n) 
	{
		this.n = n;
		diskMoves = 0;
		methodCalls = 0;
	} // Towers of Hanoi Constructor

	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);  
		System.out.println("Welcome to the Recursive Towers of Hanoi solver");
		System.out.println("Enter a number of disks to move : ");
		int n = reader.nextInt(); 
		reader.close();
		
		System.out.println(n + " Disks");
		RecursiveTowersOfHanoi tower = new RecursiveTowersOfHanoi(n);
		tower.solve(n, I, D, T);
		System.out.println("Disk Moves: " + diskMoves);
		System.out.println("Method Calls: " + methodCalls);
		System.out.println(" ");
		
	} //////////////////// end Main////////////////////

	public void solve(int n, String I, String D, String T)
	{
		
		methodCalls++;
		
		if(n==0)
		{
			//just a method call occurs
		}
		else if (n==1) 
		{
	         System.out.println("Disk 1 from " + I + " to " + D);
	         diskMoves++;
	         return;
	     	
	    } 
		else 
	    {
	         solve(n-1, I, T, D);
	         System.out.println("Disk " + n + " from " + I + " to " + D);
	         diskMoves++;
	         solve(n -1, T, D, I);
	         
	
	    }
		
	
		
	}// end solve
	
	
}// end driver
