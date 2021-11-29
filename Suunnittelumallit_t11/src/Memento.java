
public class Memento {

	private int random = 0;
	private int arvaus = 0;
	
	public Memento(int random) {
		this.random = random;
	}

	public int getRandom() {
		return random;
	}
	
	public void setArvaus(int i) {
		this.arvaus = i;
	}
	
	public int getArvaus() {
		return arvaus;
	}

}
