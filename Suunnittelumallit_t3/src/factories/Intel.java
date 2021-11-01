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

public class Intel implements AbstractFactory {
	
	private double casePrice = 80;
	private double motherboardPrice = 100;	
	private double cpuPrice = 400;
	private double ramPrice = 300;
	private double ssdPrice = 400;
	private double graphicsCardPrice = 600;
	private double soundCardPrice = 95;
	private double nicPrice = 35;
	private double chipsetPrice = 35;


	@Override
	public Case createCase() {
		return new Case(casePrice);
	}

	@Override
	public Motherboard createMotherboard() {
		return new Motherboard(motherboardPrice);
	}

	@Override
	public CPU createCPU() {
		return new CPU(cpuPrice);
	}

	@Override
	public RAM createRAM() {
		return new RAM(ramPrice);
	}

	@Override
	public SSD createSSD() {
		return new SSD(ssdPrice);
	}

	@Override
	public GraphicsCard createGraphicsCard() {
		return new GraphicsCard(graphicsCardPrice);
	}

	@Override
	public SoundCard createSoundCard() {
		return new SoundCard(soundCardPrice);
	}

	@Override
	public NIC createNIC() {
		return new NIC(nicPrice);
	}

	@Override
	public Chipset createChipSet() {
		return new Chipset(chipsetPrice);
	}
	
	@Override
	public Double getPrice() {
		double total = (casePrice + motherboardPrice + cpuPrice + ramPrice + ssdPrice + graphicsCardPrice + soundCardPrice + nicPrice + chipsetPrice);
		return total;
	}	
}
