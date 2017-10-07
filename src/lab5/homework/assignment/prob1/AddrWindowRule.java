package lab5.homework.assignment.prob1;

import java.awt.Component;
import java.util.HashMap;
import java.util.List;

public class AddrWindowRule implements RuleSet {

	@Override
	public void applyRules(HashMap<String, String> parameters) throws RulesException {
		// TODO Auto-generated method stub
		if (parameters == null)
			throw new RulesException("NullPointerException");
		try {
			Integer.parseInt(parameters.get("id"));
			Integer.parseInt(parameters.get("zip"));
			if (parameters.get("zip").length() != 5) {
				throw new RulesException("Zip length is not correct");
			}
			if (parameters.get("state").length() != 2) {
				throw new RulesException("state is wrong");
			}
			if (parameters.get("id").equals(parameters.get("zip"))) {
				throw new RulesException("id is not equal to zip");
			}
		} catch (NumberFormatException e) {
			throw new RulesException(e.getMessage());
		} catch (RulesException e) {
			System.out.println(e.getMessage());
		}
	}

}
