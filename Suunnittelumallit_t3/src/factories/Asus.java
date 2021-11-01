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

public class Asus implements AbstractFactory {
	
	private double casePrice = 100;
	private double motherboardPrice = 50;	
	private double cpuPrice = 300;
	private double ramPrice = 150;
	private double ssdPrice = 200;
	private double graphicsCardPrice = 350;
	private double soundCardPrice = 70;
	private double nicPrice = 15;
	private double chipsetPrice = 20;

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
