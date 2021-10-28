//Aim: Java Program to create a Method to check if the number is a power of Two or not.
package lab1.poweroftwo;

import java.util.Scanner;

public class PowerOfTwo
{
	// checking power of 2 or not
	static boolean checkNumber(int n)
	{

		if (n == 0)
			return false;
		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check for power of two: ");
		int n = sc.nextInt();
		if (checkNumber(n))
			System.out.println(n + " is a power of 2");
		else {
			System.out.println(n + " is not a power of 2.");
		}
	}
}
