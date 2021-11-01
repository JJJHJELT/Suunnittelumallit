package hardware;

public class GraphicsCard implements ComputerComponent {
	
	private double price = 600;
	
	public GraphicsCard() {
	
	}
	
	public GraphicsCard(double price) {
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
