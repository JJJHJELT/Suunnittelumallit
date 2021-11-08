
public abstract class PizzaDecorator implements Pizza {
	
	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public int getPrice() {
		return pizza.getPrice();		
	}
}
