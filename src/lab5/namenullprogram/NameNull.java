package lab5.namenullprogram;
import java.util.*;
 class NameException extends RuntimeException {
	String firstName;
	String lastName;
	public NameException(String firstName, String lastName)
	{
		System.out.print(" "+firstName+" "+lastName);
	}
}
public class NameNull
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter the name of the Employee");
		System.out.println("enter the first name");
		String firstName=sc.next();
		System.out.println("enter the last name");
		String lastName=sc.next();
		if(firstName==null || lastName==null)
		{
			throw new InvalidNameException("first name and last name cannot be blank");
		}
		else
		{
			System.out.println("you first name is: " +firstName+" and last name is "+ lastName);
		}
	}
		catch(InvalidNameException nne)
		{
			System.out.println("no data entered");
		}
}
}
