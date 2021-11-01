package assembly;

import factories.AbstractFactory;
import hardware.CPU;
import hardware.Case;
import hardware.Chipset;
import hardware.GraphicsCard;
import hardware.Motherboard;
import hardware.NIC;
import hardware.RAM;
import hardware.SSD;
import hardware.SoundCard;

public class computerAssembly {

	private Case computerCase;
	private Chipset chipset;
	private CPU cpu;
	private GraphicsCard graphicsCard;
	private Motherboard motherboard;
	private NIC nic;
	private RAM ram;
	private SoundCard soundCard;
	private SSD ssd;
	
	public void assemble(AbstractFactory factory) {
		chipset = factory.createChipSet();
		cpu = factory.createCPU();
		graphicsCard = factory.createGraphicsCard();
		nic = factory.createNIC();
		ram = factory.createRAM();
		soundCard = factory.createSoundCard();
		ssd = factory.createSSD();
		motherboard = factory.createMotherboard();
		computerCase = factory.createCase();
	}
}
