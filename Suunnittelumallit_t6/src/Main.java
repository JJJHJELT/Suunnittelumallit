
public class Main {
	public static void main(String[] args) {
		
		Pizza readyPizza = new Salami(new Cheese(new Crust(new PizzaImpl())));
		System.out.println(readyPizza.getPrice());		
	}
}
