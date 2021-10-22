package Banking;
public class BankAccount {
	String firstName;
	String lastName;
	String ssn;
	static float balance;
	float deposit;
	float withdraw;
	long accountNumber;
	
	BankAccount()
	{
	}
		BankAccount(String firstName, String lastName, String ssn, float balance)
		{
			this.firstName=firstName;
			this.lastName=lastName;
			this.ssn=ssn;
			this.balance=balance;
		}
long accountNumber()
{
	long accountNumber=(long)Math.floor(Math.random()*9000000000L)+100000000L;
	return accountNumber;
}
public void deposit(float amount) {
	balance=0;
	balance=balance+amount;
	System.out.println(firstName+" "+lastName+" "+ "deposited" + deposit + "current balance" + balance);
}
public void withdraw(float amount)
{
	if(balance>=withdraw)
	{
		balance=balance-withdraw;
		System.out.println(firstName+" "+lastName+" "+ "withdrew" + withdraw + "current balance"+balance);
	}
	if(balance<withdraw)
	{
		System.out.println("unable to withdraw"+amount+"for"+firstName+" "+lastName+"due to insufficient funds");
}
}


}