
public class SingletonFactory {
	
	private static SingletonFactory INSTANCE = null;
	
	private SingletonFactory() {}

	public static SingletonFactory getInstance(){
		if (INSTANCE == null){
		INSTANCE = new SingletonFactory();
		
		}
		return INSTANCE;
		}
	
	public Shirt createShirt() {
		return new PoloShirt();		
	}
}
