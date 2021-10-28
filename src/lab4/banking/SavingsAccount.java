package lab4.banking;
public class SavingsAccount extends BankAccount {
	public SavingsAccount()
	{
		
	}
	public SavingsAccount(String firstName, String lastName, String ssn, float balance)
	{
		super(firstName, lastName, ssn, balance);
		System.out.println("successfully created account for"+firstName+" "+lastName+" "+accountNumber);
		System.out.println(firstName+" "+lastName+" "+balance);
	}
	

}

