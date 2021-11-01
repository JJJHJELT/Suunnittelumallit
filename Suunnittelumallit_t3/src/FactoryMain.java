import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import assembly.computerAssembly;
import factories.AbstractFactory;

//Hyvän mielen bonus
public class FactoryMain {
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
			
			computerAssembly assembler = new computerAssembly();
			assembler.assemble(factory);
			
			System.out.println("Tietokoneen kokonaishinta on: " + factory.getPrice() + " euroa.");			
	}
}