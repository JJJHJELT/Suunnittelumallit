
public class Charmander implements State {

	@Override
	public void growl() {
		System.out.println("Charmander used Growl!");
	}

	@Override
	public void scratch() {
		System.out.println("Charmander used Scratch!");
	}

	@Override
	public void slash() {
		System.out.println("Charmander used Slash!");
	}

	@Override
	public void evolve(Pokemon pokemon) {
		System.out.println("Charmander is evolving...");
		pokemon.setState(new Charmeleon());
	}
}
