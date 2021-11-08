
public class Salami extends PizzaDecorator {
	
	private int price = 2;

	public Salami(Pizza pizza) {
		super(pizza);
	}
		
	public int getPrice() {
		return super.getPrice() + getSalamiPrice();
	}
	
	private int getSalamiPrice() {
		return price;
	}
}
