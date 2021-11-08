
public class Crust extends PizzaDecorator {
	
	private int price = 1;

	public Crust(Pizza pizza) {
		super(pizza);
	}

	private int getCrustPrice() {
		return price;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getCrustPrice() ;
	}	
	
	private String getCrustName() {
		return "PizzaCrust ";
	}
	
	public String getMenu() {
		return super.getMenu() + getCrustName();	
	}
}
