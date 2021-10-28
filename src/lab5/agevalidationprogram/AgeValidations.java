//Aim: Java Program to Validate the age of a person and display the proper message by using the userdefined exceptions. Age of a person should be above 15.
package lab5.agevalidationprogram;
import java.util.*;
class AgeValidations
{	
	static Scanner sc;
	public static void main(String[] args)
	{
		checkAge();
	}
	
	//for checking a age is valid or not
	public static void checkAge()
	{
		sc= new Scanner(System.in);
		System.out.println("To access the Facbook, Your should be Above 15 Years");
		System.out.println("Enter the Age to access Facebook");
		int age=sc.nextInt();
		try
		{
			if(age<=0)
			{
				throw new InvalidNumberException("Invalid Input.");
			}
			else if(age<15)
			{
				throw new InvalidAgeException("Sorry, you should be above 18 years");
			}
			else
			{
				System.out.println("welcome to facebook");
			}
		}
        catch(InvalidAgeException iage) 
		{	
			System.out.println("You are resticted to use this site");
			
		}
		catch(InvalidNumberException ine)
		{
			System.out.println("Please give greater than 0");
		}
	}
}
