//ii. Using no recursion
package lab1.fibonacci;

import java.util.Scanner;

//non recursive method
public class FibonacciWithoutRecursion 
{
	public static void main(String[] args) 
	{
		int n, i;
		int a = 0; // initializing the values of a and b;
		int b = 1;
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term");
		n = sc.nextInt(); // value upto which fibonacci needs to be read.
		for (i = 0; i < n; i++) {
			System.out.println(a); // for each iteration a's value will be changed and sum is added upto nth term.
			c = a + b;
			a = b;
			b = c;
		}
	}
}
