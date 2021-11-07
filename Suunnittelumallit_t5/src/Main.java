
public class Main {
	public static void main(String[] args) {

		SingletonFactory factory = SingletonFactory.getInstance();
		Shirt poloShirt = factory.createShirt();
		System.out.println(poloShirt.toString());		
		
	}
}
