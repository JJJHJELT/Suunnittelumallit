
public class Main {

	public static void main(String[] args) {		
		Riddler riddler = new Riddler();
		Customer customer = new Customer(riddler);
		customer.start();
	}
}
