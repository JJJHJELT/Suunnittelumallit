
public class Pepperoni extends PizzaDecorator {
	
	private int price = 2;

	public Pepperoni(Pizza pizza) {
		super(pizza);
	}
		
	private int getPepperoniPrice() {
		return price;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getPepperoniPrice() ;
	}	
	
	private String getPepperoniName() {
		return "Pepperoni ";
	}
	
	public String getMenu() {
		return super.getMenu() + getPepperoniName();	
	}
}
