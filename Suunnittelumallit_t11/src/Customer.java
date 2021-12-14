import java.util.Random;

public class Customer implements Runnable {
	
	private Thread thread;
	private Riddler riddler;
	private Memento memento;
	private int guess;
	
	public Customer(Riddler riddler) {
		this.riddler = riddler;
	}
	
	public void join(Riddler a) {
		this.memento = riddler.joinGame();
	}
	
	@Override
	public void run() {

		try {
			memento = riddler.joinGame();
			boolean win = false;
			while(!win) {
				Random random = new Random();
				int guess = random.nextInt(10);
				
				memento.setGuess(guess);
				win = riddler.compare(memento);
				Thread.sleep(50);
			}
			
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
	}
	
    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
}
