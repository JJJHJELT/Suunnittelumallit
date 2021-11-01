package factories;
import boss.BossCap;
import boss.BossPants;
import boss.BossShirt;
import boss.BossShoes;
import clothes.Cap;
import clothes.Pants;
import clothes.Shirt;
import clothes.Shoes;

public class ConcreteBossFactory implements AbstractFactory {

	@Override
	public Shirt createShirt() {
		return new BossShirt();
	}

	@Override
	public Pants createPants() {
		return new BossPants();
	}

	@Override
	public Cap createCap() {
		return new BossCap();
	}

	@Override
	public Shoes createShoes() {
		// TODO Auto-generated method stub
		return new BossShoes();
	}

}
