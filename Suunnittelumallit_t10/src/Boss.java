
public class Boss extends Raise {

	@Override
	protected double maxRaise() {
		return RAISE * 5;
	}

	@Override
	protected String getRole() {
		return "Boss";
	}
}
