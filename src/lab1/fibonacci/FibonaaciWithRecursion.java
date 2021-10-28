//Java program to find the fibonacci sequence of a number
//i. using Recursion
package lab1.fibonacci;

import java.util.*;

//Fibonacci using the Recursion
class FibonacciWithRecursion 
{
	static int fib(int n)  //recursion
	{
		if (n <= 1) 
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nth term");
		int n = sc.nextInt();
		System.out.println(fib(n));
	}
}
