package hardware;

public class SoundCard implements ComputerComponent {
	
	private double price = 100;
	
	public SoundCard() {
		
	}
	
	public SoundCard(double price) {
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
