
public class Charizard implements State {

	@Override
	public void growl() {
		System.out.println("Charizard used Growl!");
	}

	@Override
	public void scratch() {
		System.out.println("Charizard used Scratch!");
	}

	@Override
	public void slash() {
		System.out.println("Charizard used Slash!");
	}

	@Override
	public void evolve(Pokemon pokemon) {}

}
