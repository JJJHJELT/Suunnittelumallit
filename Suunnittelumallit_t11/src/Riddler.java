import java.util.Random;

public class Riddler {
	
	private int guess = 0;
	
	public Riddler() {
	}
	
	public Memento joinGame() {
		Random random = new Random();
		int toGuess = random.nextInt(10);
		System.out.println("Number to guess: " + toGuess + "\n");
		return new Memento(toGuess);		
	}

	public boolean compare(Memento memento) {
		guess = memento.getGuess();
		if (memento.getRandom() == guess) {
			System.out.println("You guessed right. " + guess);
			return true;
		} else {
			System.out.println("You guessed wrong. " + guess);
			return false;
		}
	} 
}
