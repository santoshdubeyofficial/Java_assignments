//Aim: Java Program to find if the entered number is prime or not
package lab1.primes;

import java.util.Iterator;
import java.util.Scanner;

public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range for prime number: ");
		int n = sc.nextInt();
		System.out.println("Prime numbers between 1 to " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			if (i <= 1)
				continue;
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0)
				{
					flag = false;
					break;
				}
			}

			if (flag == true)
			{
				System.out.print(i + " ");
			}

		}
	}
}