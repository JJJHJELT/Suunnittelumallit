package hardware;

public class RAM implements ComputerComponent {
	
	private double price = 200;
	
	public RAM() {
		
	}
	
	public RAM(double price) {
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
