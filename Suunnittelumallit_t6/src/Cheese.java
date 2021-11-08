
public class Cheese extends PizzaDecorator {
		
	private int price = 3;

	public Cheese(Pizza pizza) {
		super(pizza);
	}
	
	private int getCheesePrice() {
		return price;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getCheesePrice() ;
	}	
	
	private String getCheeseName() {
		return "Cheese ";
	}
	
	public String getMenu() {
		return super.getMenu() + getCheeseName();	
	}
}
