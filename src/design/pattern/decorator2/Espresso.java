package design.pattern.decorator2;

public class Espresso extends Beverages{

	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 3;
	}
}
