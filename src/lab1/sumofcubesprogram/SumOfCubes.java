//Aim: create a method to find the sum of the cubes of the digit of an n digit number.
package lab1.sumofcubesprogram;

import java.util.*;
import java.io.*;

public class SumOfCubes 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();
		int sum = 0;
		int digit;
		while (n > 0)
		{
			digit = n % 10;
			sum = sum + digit * digit * digit;      //sum of cube of digit,
			n = n / 10;
		}
		System.out.println("the sum is " + sum);
	}
}
