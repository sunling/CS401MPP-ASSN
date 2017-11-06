package NewMPP_ASSN.Lab4.E;

public class CheckingAccount extends Account {

	private double monthlyFee;
	
	public CheckingAccount(String accountId, double balance, double monthlyFee) {
		super(accountId, balance);
		// TODO Auto-generated constructor stub
		this.monthlyFee = monthlyFee;
	}
	
	@Override
	public double getBalance(){
		return super.getBalance();
	}

	@Override
	public double computeUpdateBalance() {
		// TODO Auto-generated method stub
		return super.getBalance() - this.monthlyFee;
	}
	
	

}
