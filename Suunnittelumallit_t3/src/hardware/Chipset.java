package hardware;

public class Chipset implements ComputerComponent {
	
	private double price = 10;
	
	public Chipset() {
		
	}
	
	public Chipset(double price) {
		this.price = price;
	}

	@Override
	public void addComponent(ComputerComponent component, Double price) {
		throw new RuntimeException("Cannot add.");		
	}

	@Override
	public Double getPrice() {
		return price;
	}

}
