
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationsOfSteps{

	
	static BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		
		System.out.println("Welcome To the Step Combination Calculator");
		System.out.println("It is only possible to take one Step or Two Steps at a time");
		System.out.println("Please Enter How many Steps you want to go up:");
		
		
		
		int input = Integer.parseInt(br.readLine());
		
		
		System.out.println("Recursive Fibonacci");
		
		long start = System.currentTimeMillis();
		
		
			System.out.println("f(" + input + ") is " + recFib(input) + " combinations of steps");
		

		long end = System.currentTimeMillis();

		long elapsed = end - start;
		System.out.println(" ");
		
///////////////////////////////////////////////////////////////

		System.out.println("Iterative Fibonacci");
		long start2 = System.currentTimeMillis();

		
		
		
			System.out.println("f(" + input + ") is " + iterFib(input) + " combinations of steps");

		

		long end2 = System.currentTimeMillis();

		long elapsed2 = end2 - start2;

		System.out.println(" ");
		if (elapsed2 < elapsed) {
			System.out.println("Iterative is Faster here");
		

		} else {
			System.out.println("Recursive is Faster here");
		}

	}

	public static int recFib(int n) {

		if (n <= 2) {
			return n;
		} else {
			return recFib(n - 1) + recFib(n - 2);
		}

	}

	public static int iterFib(int n) {

		int first = 1;
		int second = 2;
		int nth = 2;

		if (n <= 2) 
		{
			return n;
		}

		for (int i = 3; i <= n; i++) {

			nth = first + second;
			first = second;
			second = nth;

		}

		return nth;

	}

}
