
public class TomatoSauce extends PizzaDecorator {
	
	private int price = 1;

	public TomatoSauce(Pizza pizza) {
		super(pizza);
	}

	private int getTomatoSaucePrice() {
		return price;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getTomatoSaucePrice() ;
	}	
	
	private String getTomatoSauceName() {
		return "TomatoSauce ";
	}
	
	public String getMenu() {
		return super.getMenu() + getTomatoSauceName();	
	}
}
