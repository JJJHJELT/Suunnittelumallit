import hardware.CPU;
import hardware.Case;
import hardware.Chipset;
import hardware.ComputerComponent;
import hardware.GraphicsCard;
import hardware.Motherboard;
import hardware.NIC;
import hardware.RAM;
import hardware.SSD;
import hardware.SoundCard;

//Composite-malli
public class CompositeMain {
	
	public static void main(String[] args) {
		
		ComputerComponent motherboard = new Motherboard();
			
		ComputerComponent chipset = new Chipset();
		motherboard.addComponent(chipset, chipset.getPrice());		
		ComputerComponent cpu = new CPU();
		motherboard.addComponent(cpu, cpu.getPrice());		
		ComputerComponent graphicsCard = new GraphicsCard();
		motherboard.addComponent(graphicsCard, graphicsCard.getPrice());		
		ComputerComponent nic = new NIC();
		motherboard.addComponent(nic, nic.getPrice());		
		ComputerComponent ram = new RAM();
		motherboard.addComponent(ram, ram.getPrice());		
		ComputerComponent soundCard = new SoundCard();
		motherboard.addComponent(soundCard, soundCard.getPrice());		
		ComputerComponent ssd = new SSD();
		motherboard.addComponent(ssd, ssd.getPrice());
		
		ComputerComponent computerCase = new Case();
		computerCase.addComponent(motherboard, motherboard.getPrice());
		
		System.out.println("Tietokoneen kokonaishinta on: " + computerCase.getPrice() + " euroa.");			
	}
}
