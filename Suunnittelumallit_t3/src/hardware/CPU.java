package hardware;

public class CPU implements ComputerComponent {
	
	private double price = 500;
	
	public CPU() {
		
	}
	
	public CPU(double price) {
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
