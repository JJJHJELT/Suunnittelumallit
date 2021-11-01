package factories;
import adidas.AdidasPants;
import adidas.AdidasShirt;
import adidas.AdidasShoes;
import adidas.AdidiasCap;
import clothes.Cap;
import clothes.Pants;
import clothes.Shirt;
import clothes.Shoes;

public class ConcreteAdidasFactory implements AbstractFactory {

	@Override
	public Shirt createShirt() {
		return new AdidasShirt();
	}

	@Override
	public Pants createPants() {
		// TODO Auto-generated method stub
		return new AdidasPants();
	}

	@Override
	public Cap createCap() {
		// TODO Auto-generated method stub
		return new AdidiasCap();
	}

	@Override
	public Shoes createShoes() {
		// TODO Auto-generated method stub
		return new AdidasShoes();
	}

}
