//Aim: Java Program that reads a line of Integers and then displays each integer and the sum of all Integers.
package lab3.sumofintegersprogram;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfIntegers
{
	public static void main(String[] args)
	{
		int n;
		int sum = 0;
		// asking for user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers: ");
		String str = sc.nextLine();

		StringTokenizer st = new StringTokenizer(str);
		System.out.println("All intergers: ");

		while (st.hasMoreTokens())//sum
		{
			String temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.print(n + " ");
			sum += n;
		}

		System.out.println();
		System.out.println("Sum of integers is: " + sum);

		// closing resource
		sc.close();
	}

}