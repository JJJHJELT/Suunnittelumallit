
public class CEO extends Raise {
	@Override
	protected double maxRaise() {
		return RAISE * 20;
	}

	@Override
	protected String getRole() {
		return "CEO";
	}
}
