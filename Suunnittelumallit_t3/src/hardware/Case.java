package hardware;

import java.util.HashMap;

public class Case implements ComputerComponent {
	
	private double casePrice = 200;
	
	public Case() {
		
	}
	
	public Case(double price) {
		this.casePrice = price;
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
		return totalCost + casePrice;
	}
	
	public void setPrice(Double price) {
		casePrice = price;		
	}
}
