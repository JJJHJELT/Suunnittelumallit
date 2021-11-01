import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import customer.Jasper;
import factories.AbstractFactory;


public class Main {

	public static void main(String[] args) {
		Class<?> c = null;
		AbstractFactory factory = null;
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/factory.properties"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty("factory"));
			factory = (AbstractFactory) c.getDeclaredConstructor().newInstance();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Jasper jasper = new Jasper();
		jasper.dressUp(factory);
		System.out.println(jasper.toString());
	}
}
