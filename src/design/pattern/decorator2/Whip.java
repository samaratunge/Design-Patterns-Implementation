package design.pattern.decorator2;

public class Whip extends CondimentDecorator{
	
	Beverages beverages;
	
	public Whip(Beverages beverages) {
		this.beverages = beverages;
	}

	@Override
	public String getDescription() {
		return beverages.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return 0.6 + beverages.cost();
	}
}
