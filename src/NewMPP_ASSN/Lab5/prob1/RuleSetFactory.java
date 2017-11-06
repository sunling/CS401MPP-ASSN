package NewMPP_ASSN.Lab5.prob1;

final public class RuleSetFactory {

	private RuleSetFactory() {
	};

	public static RuleSet getRuleSet(String name) {
		if (name == null) {
			return null;
		}

		if (name.equals("AddressWindow")) {
			return new AddrWindowRule();
		} else if (name.equals("ProfileWindow")) {
			return new ProfileWindowRule();
		}

		return null;

	}
}
