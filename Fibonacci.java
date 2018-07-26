//The following is a program that explores different methods to get the nth Fibonacci number.

//Recursive time complexity is O(2^n)	(exponential)

//Iterative time complexity is O(n) 	(linear)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
			System.out.println("Welcome To the Fibonacci Calculator");
			System.out.println("Please Enter a Postive Integer greater than or equal to 0:");
		
		///////////////////////Recursive////////////////////////////////////////
		int input = Integer.parseInt(br.readLine());

			System.out.println("Recursive Fibonacci");
		
		long start = System.currentTimeMillis();
			System.out.println("f(" + input + ") is " + recFib(input));
		long end = System.currentTimeMillis();
		long elapsed = end - start;
			System.out.println(" ");
		
		///////////////////////Iterative////////////////////////////////////////

			System.out.println("Iterative Fibonacci");
		long start2 = System.currentTimeMillis();
			System.out.println("f(" + input + ") is " + iterFib(input));
		long end2 = System.currentTimeMillis();
		long elapsed2 = end2 - start2;
			System.out.println(" ");
		if (elapsed2 == elapsed) {
			System.out.println("Iterative is Faster");
			System.out.println( elapsed2 + " is faster than " + elapsed);

		} else {
			System.out.println("Recursive is Faster");
		}

	}//end main()

	public static int recFib(int n) {
		if (n == 0) {
			return 0;
		} else if (n <= 2) {
			return 1;
		} else {
			return recFib(n - 1) + recFib(n - 2);
		}

	} //end recFib()

	public static int iterFib(int n) {
		int first = 1;
		int second = 1;
		int nth = 1;

		if (n == 0) {
			return 0;
		} 
		else if (n <= 2) {
			return 1;
		}

		for (int i = 3; i <= n; i++) {
			nth = first + second;
			first = second;
			second = nth;
		}

		return nth;
	}//end iterFib()

}//end Class
