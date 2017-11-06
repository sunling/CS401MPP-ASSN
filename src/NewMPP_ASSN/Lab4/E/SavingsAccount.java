package NewMPP_ASSN.Lab4.E;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public SavingsAccount(String accountId, double balance, double interestRate) {
		super(accountId, balance);
		// TODO Auto-generated constructor stub
		this.interestRate = interestRate;
		
	}
	
	
	@Override
	public double getBalance(){
		return super.getBalance();
	}


	@Override
	public double computeUpdateBalance() {
		// TODO Auto-generated method stub
		return super.getBalance()+super.getBalance()*interestRate/100;
	}

}
