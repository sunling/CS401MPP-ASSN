package NewMPP_ASSN.Lab4.E;

import java.util.List;

public class Admin {
	
	public static double computeUpdatedBalanceSum (List<Employee> employeeList){
		double sum = 0;
		
		for(Employee employee:  employeeList){
			sum +=  employee.computeBalance();
		}
		
		return sum;
	}

}
