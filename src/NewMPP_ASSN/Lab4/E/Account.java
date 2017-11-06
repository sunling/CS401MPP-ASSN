package NewMPP_ASSN.Lab4.E;

public abstract class Account {

	private String accountId;
	private double balance;
	
	
	public Account(String accountId, double balance){
		this.accountId = accountId;
		this.balance = balance;
	}

	
	public double getBalance() {
		return balance;
	}
	
	public abstract double computeUpdateBalance();


	
	
	
	
}
