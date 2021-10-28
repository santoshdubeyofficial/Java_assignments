package lab4.banking;
public class BankApp
{
	public static void main(String args[])
		{
			CurrentAccount cc1=new CurrentAccount("shivam","kumar","9555445524",2000.0f);
			SavingsAccount ss1=new SavingsAccount("arvind","kumar","9347582136",3000.0f);
			cc1.deposit(2000.00f);
			ss1.withdraw(2000.00f);
		}

	}

