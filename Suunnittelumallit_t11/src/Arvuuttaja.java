import java.util.Random;

public class Arvuuttaja {
	
	private int arvaus = 0;
	private int pelaajat = 0;
	private Memento m;
	
	public Arvuuttaja() {
	}
	
	public Memento liityPeliin() {
		Random random = new Random();
		int arvattava = random.nextInt(10);
		System.out.println("Arvattava luku = " + arvattava);
		return new Memento(arvattava);		
	}

	public boolean vertaa(Memento m) {
		this.m = m;
		arvaus = m.getArvaus();
		if (m.getRandom() == arvaus) {
			System.out.println("Arvasit oikein! " + arvaus);
			return true;
		} else {
			System.out.println("Arvasit väärin. " + arvaus);
			return false;
		}
	} 
	
	

}
