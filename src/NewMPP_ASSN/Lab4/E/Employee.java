package NewMPP_ASSN.Lab4.E;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String employeeName;
	private List<Account> listOfAccounts;
	
	public Employee(String employeeName){
		this.employeeName = employeeName;
		listOfAccounts =  new ArrayList<>();
	}
	
	public void addAccount(Account account){
		listOfAccounts.add(account);
	}
	
	public double computeBalance(){
		return listOfAccounts.stream().mapToDouble(e->e.getBalance()).sum();
	}
	
	
}
