
public class Crust extends PizzaDecorator {
	
	private int price = 1;

	public Crust(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getCrustPrice() ;
	}
	
	private int getCrustPrice() {
		return price;
	}
}
