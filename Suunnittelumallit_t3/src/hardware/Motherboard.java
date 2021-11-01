package hardware;

import java.util.HashMap;

public class Motherboard implements ComputerComponent {
	
	private double motherboardPrice = 175;
	
	public Motherboard() {
		
	}
	
	public Motherboard(double price) {
		this.motherboardPrice = price;
	}

	HashMap<ComputerComponent, Double> componentList = new HashMap<ComputerComponent, Double>();

	@Override
	public void addComponent(ComputerComponent componentToAdd, Double componentPrice) {
		componentList.put(componentToAdd, componentPrice);		
	}

	@Override
	public Double getPrice() {
		double totalCost = 0;
		for(ComputerComponent componentToAdd: componentList.keySet()) {
			double price = componentList.get(componentToAdd);
			totalCost += price;
		}
		return totalCost + motherboardPrice;
	}
}
