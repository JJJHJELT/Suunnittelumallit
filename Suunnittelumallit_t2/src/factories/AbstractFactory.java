package factories;
import clothes.Cap;
import clothes.Pants;
import clothes.Shirt;
import clothes.Shoes;

public interface AbstractFactory {	
	public abstract Shirt createShirt();
	public abstract Pants createPants();
	public abstract Cap createCap();
	public abstract Shoes createShoes();
}
