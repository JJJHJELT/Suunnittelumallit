package factories;
import hardware.CPU;
import hardware.Case;
import hardware.Chipset;
import hardware.GraphicsCard;
import hardware.Motherboard;
import hardware.NIC;
import hardware.RAM;
import hardware.SSD;
import hardware.SoundCard;

public interface AbstractFactory {
	public abstract Case createCase();
	public abstract Motherboard createMotherboard();
	public abstract Chipset createChipSet();
	public abstract CPU createCPU();
	public abstract RAM createRAM();
	public abstract SSD createSSD();
	public abstract GraphicsCard createGraphicsCard();
	public abstract SoundCard createSoundCard();
	public abstract NIC createNIC();
	public Double getPrice();
}
