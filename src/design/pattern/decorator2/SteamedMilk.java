package design.pattern.decorator2;

public class SteamedMilk extends CondimentDecorator{
	
	Beverages beverages;
	
	public SteamedMilk(Beverages beverages) {
		this.beverages = beverages;
	}

	@Override
	public String getDescription() {
		return beverages.getDescription() + ", SteamedMilk";
	}

	@Override
	public double cost() {
		return 0.75 + beverages.cost();
	}
}
