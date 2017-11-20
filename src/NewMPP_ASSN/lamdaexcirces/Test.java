package NewMPP_ASSN.lamdaexcirces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {
	
	public static void main(String [] string){
		Function<Employee, String> employee = e->e.getName();
		Function<Employee, String> employee2 = Employee::getName;
		
		BiConsumer<Employee, String> empSet = (e,s)->e.setName(s);
		
//		Function<String, String> comparing = new Function<String, String>{
//			
//		}
		
	}
}
