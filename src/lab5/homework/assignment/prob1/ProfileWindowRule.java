package lab5.homework.assignment.prob1;

import java.awt.Component;
import java.util.HashMap;
import java.util.List;

public class ProfileWindowRule implements RuleSet {

	@Override
	public void applyRules(HashMap<String, String> parameters) throws RulesException {
		// TODO Auto-generated method stub
		if (parameters == null)
			throw new RulesException("NullPointerException");
		try {
			Integer.parseInt(parameters.get("id"));
			if (parameters.get("favres").equals(parameters.get("favmovie"))) {
				new RulesException("Movies and Restaurant cant be the same");
			}
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(NumberFormatException e){
			new RulesException("NumberFormatException");
		}

	}

}
