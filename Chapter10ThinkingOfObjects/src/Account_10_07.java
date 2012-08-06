import java.util.Scanner;


public class Account_10_07 
{
	
	private double balance;
	private double withdrow;
	private double deposit;
	private boolean exit;
	
	
	public Account_10_07() 
	{
		balance = 100;
		withdrow = 0;
		deposit = 0;
		exit = false;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrow() {
		return withdrow;
	}

	public void setWithdrow(double withdrow) {
		this.withdrow = withdrow;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//call the constructor
		Account_10_07 acc = new Account_10_07();
		
		//crate an array
		Account_10_07 [] store = new Account_10_07[10];
		
		
		for(int i=0; i<10; i++)
		{
			store[i] = new Account_10_07();
			System.out.println(store[i]);
		}
		
		System.out.println("Enter an Id: ");
		int id = input.nextInt();
		
		while(true)
		{
			callMe();
			
		}
		
		
		
	}

	public static void callMe()
	{
		Account_10_07 acc = new Account_10_07();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Main Menu:" +
				"\n 1:Check balance" +
				"\n 2:withdraw" +
				"\n 3:deposit" +
				"\n 4:exit" +
				"\n Enter a choice");
		int choice = input.nextInt();
		
		switch(choice)
		{
			case 1: acc.getBalance();
			break;
			case 2: acc.getWithdrow();
			break;
			case 3: acc.getDeposit();
			break;
			case 4: System.exit(0);
			
			
			
		}
	}
}
