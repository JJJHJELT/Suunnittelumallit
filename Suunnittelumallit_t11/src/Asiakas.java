import java.util.Random;

public class Asiakas implements Runnable {
	
	private Thread t;
	private Arvuuttaja a;
	private Memento m;
	private int arvaus;
	
	public Asiakas(Arvuuttaja a) {
		this.a = a;
	}
	
	public void liity(Arvuuttaja a) {
		this.m = a.liityPeliin();
	}
	
	@Override
	public void run() {

		try {
			m = a.liityPeliin();
			boolean voitto = false;
			while(!voitto) {
				Random random = new Random();
				int arvaus = random.nextInt(10);
				
				m.setArvaus(arvaus);
				voitto = a.vertaa(m);
				Thread.sleep(50);
			}
			
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
	}
	
    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}
