//Aim: Create an Exception class named as “EmployeeException”(User defined Exception) in a package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000. Use Exception Handling mechanism to handle exception properly.
package com.cg.eis.exception;
import java.util.*;
class EmployeeException extends RuntimeException
{
	int sal;
	public EmployeeException(int sal)
	{
		System.out.println(sal);
	}
}
	class Employee
	{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the salary");
			int sal=sc.nextInt();
			try
			{
				if(sal<3000)
				{
					throw new InvalidSalaryException("salary cannot be less than 3000");
				}
				else
				{
					System.out.println("valid salary");
				}
			}
			catch(InvalidSalaryException ee)
			{
				System.out.println("exception caught");
			}
		}
}
