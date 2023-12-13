package design.pattern.decorator2;

public class Decaf extends Beverages{
	
	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return 2;
	}
}
