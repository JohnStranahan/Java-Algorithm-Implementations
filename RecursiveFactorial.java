
/*
 * 
 * a)  n0 = 13. The max value of an int is 2,147,483,647 but 13! exceeds that data types size limit so overflow occurs.
 *  Long can be used to represent a larger number. see output
 * b)  n1 = 21. The max vale of a Long is 9,223,372,036,854,775,807 but 21! exceeds the data types size limit so overflow occurs.
 *   BigInteger can be used to represent a larger number. see output
 * c) When the value of an int or long reaches Integer.MAX_VALUE, incrementing it causes overflow and causes it to wrap around to Integer.MIN_VALUE.
 * 
 * 
 * @author: John Stranahan
 * @version: 2017.10.30
 */

import java.math.BigInteger;

public class RecursiveFactorial
{

	public static void main(String[] args) 
	{ 

		System.out.println("Part A");
		System.out.println("FACTORIAL ERROR using INT");
		for (int i = 0; i < 14; i++) 
		{		
				System.out.println(i + "!      =       " +  rFactorial(i));
		}
		System.out.println("FAILS AT 13! should be 6227020800 but...");
		System.out.println("max value of int = 2,147,483,647");
		
		System.out.println("");
		System.out.println("Part B");
		System.out.println("FACTORIAL WITH LONG");
		for (Long i = (long) 0; i < 22; i++) 
		{
				System.out.println(i + "!      =       " +  rFactorialFixed(i));
			
		}
		System.out.println("FAILS AT 21! should be 51090942171709440000 but...");
		System.out.println("max value of Long = 9,223,372,036,854,775,807 ");

		System.out.println("");
		System.out.println("FACTORIAL WITH BIGINTEGER");
		 System.out.println("100! = " + factorial(new BigInteger("100")));
		 

		
	} ///////////////END MAIN//////////////////
	
	
	public static int rFactorial(int n)
	{
		int result = 0;
			if(n==1||n==0)
			{
				result = n;
			}
			else
			{
				result = rFactorial(n-1) * n;
			}
			return result;
			
	} ///////////////END rFib////////////////// 
	
	

	public static Long rFactorialFixed(Long n)
	{
			Long result = (long) 0;
			if(n==1||n==0)
			{
				result = n;
			}
			else
			{
				result = rFactorialFixed(n-1) * n;
			}
			return result;
			
	} ///////////////END rFib////////////////// 
	
	
	public static BigInteger factorial(BigInteger n) {
	    if (n.equals(BigInteger.ZERO))
	        return BigInteger.ONE;
	    else
	        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}

}

