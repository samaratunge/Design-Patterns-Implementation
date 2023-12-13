package design.pattern.decorator2;

public class Soy extends CondimentDecorator{
	
	Beverages beverages;
	
	public Soy(Beverages beverages) {
		this.beverages = beverages;
	}

	@Override
	public String getDescription() {
		return beverages.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.25 + beverages.cost();
	}
}
