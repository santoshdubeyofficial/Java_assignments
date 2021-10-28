package lab4.banking;
public class CurrentAccount extends BankAccount
{
	public CurrentAccount()
	{

	}
	public CurrentAccount(String firstName, String lastName, String ssn, float balance)
	{
		super(firstName, lastName, ssn, balance);
		System.out.println("Successfully created account for"+firstName+" "+lastName+" "+accountNumber);
		System.out.println(firstName+" "+lastName+" "+"Balance"+balance);
	}
	
}

