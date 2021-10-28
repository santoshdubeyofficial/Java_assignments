//Aim: Java program to find the sum of first n natural numbers which are divisible by 3 or 5. 
package lab1.sumoffirstprogram;
import java.util.Scanner;
public class SumOfFirst
{
	//Calculate Sum on the conditions divisible by 3 or 5.
		static int calculateSum(int n) 
		{
			int sum=0;
			for(int i=1;i<=n;i++) {
				if(i%3==0 || i%5==0)
					sum=sum+i;
			}
			return sum;
		}

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to find natural numbers: ");
		int n= sc.nextInt();
		System.out.println("Sum of natural numbers is: "+ calculateSum(n));

	}
	
}
