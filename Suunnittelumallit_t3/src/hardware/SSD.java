package hardware;

public class SSD implements ComputerComponent {

	private double price = 250; 
	
	public SSD() {
		
	}
	
	public SSD(double price) {
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
