package customer;

import clothes.Cap;
import clothes.Pants;
import clothes.Shirt;
import clothes.Shoes;
import factories.AbstractFactory;

public class Jasper {
	private Shirt shirt;
	private Pants pants;
	private Shoes shoes;
	private Cap cap;
	
	public void dressUp(AbstractFactory factory) {
		shirt = factory.createShirt();
		pants = factory.createPants();
		shoes = factory.createShoes();
		cap = factory.createCap();
	}
	
	public String toString() {
		return "Minulla on päällä " + shirt + ", " + pants + ", " + shoes + ", " + cap + ".";
	}
}
