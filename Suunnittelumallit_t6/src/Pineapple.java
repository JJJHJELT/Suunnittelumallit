
public class Pineapple extends PizzaDecorator {
	
	private int price = 1;

	public Pineapple(Pizza pizza) {
		super(pizza);
	}

	private int getPineapplePrice() {
		return price;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getPineapplePrice() ;
	}	
	
	private String getPineappleName() {
		return "Pineapple ";
	}
	
	public String getMenu() {
		return super.getMenu() + getPineappleName();	
	}
}
