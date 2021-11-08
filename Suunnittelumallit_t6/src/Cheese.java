
public class Cheese extends PizzaDecorator {
		
	private int price = 2;

	public Cheese(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getCheesePrice() ;
	}	
	
	private int getCheesePrice() {
		return price;
	}
}
