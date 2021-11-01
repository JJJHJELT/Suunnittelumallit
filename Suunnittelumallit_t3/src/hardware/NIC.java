package hardware;

public class NIC implements ComputerComponent {

	private double price = 100;
	
	public NIC() {
		
	}
	
	public NIC(double price) {
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
