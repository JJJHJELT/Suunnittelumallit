
public class Main {

	public static void main(String[] args) {
		
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Asiakas asiakas = new Asiakas(arvuuttaja);
		asiakas.start();
	}
}
