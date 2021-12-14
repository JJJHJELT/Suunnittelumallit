
public class Manager extends Raise {
	@Override
	protected double maxRaise() {
		return RAISE * 2;
	}

	@Override
	protected String getRole() {
		return "Manager";
	}
}
