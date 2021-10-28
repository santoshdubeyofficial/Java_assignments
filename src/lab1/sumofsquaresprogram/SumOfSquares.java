//Aim: Java program with a method to find the differences between the sum of the squares and the squares of the sum of the first n natural numbers.
package lab1.sumofsquaresprogram;

import java.util.Scanner;

public class SumOfSquares 
{
	static int calculateDifference(int n)
	{
		int sum1 = 0;
		int sum2 = 0;
		int difference = 0;
		//sum of the first n natural numbers logic
		for (int i = 0; i <= n; i++)
		{
			sum1 += (i * i);
			sum2 += i;
		}
		//differnce
		int squareOfSum = (sum2 * sum2);
		difference = squareOfSum - sum1;
		return difference;

	}

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range: ");
		int n = sc.nextInt();

		System.out.println("Difference between sum of square and square of sum is: " + calculateDifference(n));

	}

	
}
