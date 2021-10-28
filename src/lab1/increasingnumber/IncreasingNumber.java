//Aim: Java program to check if the number is an increasing number.
package lab1.increasingnumber;

import java.util.Scanner;

public class IncreasingNumber
{
	// check a number if it is in increasing order
	static boolean checkNumber(int number)
	{

		int lastDigit = number % 10;
		number /= 10;
		boolean flag = false;

		while (number > 0)
		{
			if (lastDigit <= number % 10)
			{
				flag = true;
				break;
			}

			lastDigit = number % 10;
			number /= 10;

		}
		if (flag)
			return false;
		else {
			return true;
		}

	}

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		//input
		System.out.println("Enter a number you want to check for increasing number: ");
		int number = sc.nextInt();
           //output based on the conditions
		if (checkNumber(number))
			System.out.println("Number is an increasing number.");
		else 
		{
			System.out.println("Number is not an increasing number.");
		}

	}
}
