
public class CharmeleonState implements State {

	@Override
	public void growl() {
		System.out.println("Charmeleon used Growl!");
	}

	@Override
	public void scratch() {
		System.out.println("Charmeleon used Scratch!");
	}

	@Override
	public void slash() {
		System.out.println("Charmeleon used Slash!");
	}

}
