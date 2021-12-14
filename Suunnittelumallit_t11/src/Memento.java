
public class Memento {

	private int random = 0;
	private int guess = 0;
	
	public Memento(int random) {
		this.random = random;
	}

	public int getRandom() {
		return random;
	}
	
	public void setGuess(int i) {
		this.guess = i;
	}
	
	public int getGuess() {
		return guess;
	}
}
