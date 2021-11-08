
public class Main {
	
	public static void main(String[] args) {
		
		Pizza pepperoniPizza = new Cheese(new Pepperoni(new TomatoSauce(new Crust(new PizzaImpl()))));
		Pizza margheritaPizza = new Cheese(new TomatoSauce(new Crust(new PizzaImpl())));
		Pizza pineapplePizza = new Cheese(new Pineapple(new Pepperoni(new TomatoSauce(new Crust(new PizzaImpl())))));
		
		System.out.println("Pepperoni: " + pepperoniPizza.getMenu() + "--- Price: " + pepperoniPizza.getPrice() + "\n");
		System.out.println("Margherita: " + margheritaPizza.getMenu() + "---- Price: " + margheritaPizza.getPrice() + "\n");
		System.out.println("Pineapple: " + pineapplePizza.getMenu() + "--- Price: " + pineapplePizza.getPrice());		
	}
}
