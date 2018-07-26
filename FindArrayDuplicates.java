/**
 * Iteratively find a duplicate in an array - O(n^2) time
 * 
 * Finding a duplicate in an array by adding an array to a Set (cannot have duplicates
 *  and checking if it has been successfully added
 * 	O(n) time
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;



public class FindArrayDuplicates 
{

static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

public static void main(String[] args) throws NumberFormatException, IOException
{
	
	System.out.println("What size array woud you like?");
	
	int mySize = Integer.parseInt(br.readLine());
	
	int[] myArray = new int[mySize];
	
	
	for(int i = 0; i < myArray.length; i++)
	{
		System.out.println("Please enter a number in the array");

		myArray[i] = Integer.parseInt(br.readLine());
	}
	
	checkForDuplicatesWithIteration(myArray);
	checkForDuplicatesWithSets(myArray);
	
	
	
}
	
	
public static void checkForDuplicatesWithIteration(int myArray[])
{
	for(int i = 0; i < myArray.length; i++)
	{
		for(int j = i + 1; j < myArray.length; j++)
		{
			if(myArray[i] == myArray[j])
			{
				System.out.println("Two Iterative Loops: " + myArray[j] + " is a duplicate");
			} 

		}
	}
	
} // end checkForDuplicatesWithArrays()

public static void checkForDuplicatesWithSets(int myArray[])
{
		Set<Integer> mySet = new HashSet<Integer>();
		
		for(int i = 0; i < myArray.length; i++)
		{
			if(mySet.add(myArray[i]) == false)
			{ 
				System.out.println("Adding Array to A Set: " + myArray[i] + " is a duplicate");
				
			}
			
			
		}
		
}
	
}// end class
