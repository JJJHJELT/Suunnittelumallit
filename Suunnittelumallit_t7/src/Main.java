
public class Main {
	
	public static void main(String[] args) {
		
		Pokemon pokemon = new Pokemon(new Charmander());
		for(int i = 0; i < 3; i++) {
			pokemon.getState().growl();
			pokemon.getState().slash();
			pokemon.getState().scratch();
			pokemon.getState().evolve(pokemon);
			
		}
	}
}
