package NewMPP_ASSN.Lab5.prob1;

import java.awt.Component;
import java.util.HashMap;
import java.util.List;

public interface RuleSet {
	public void applyRules(HashMap<String, String> parameters) throws RulesException;
}
