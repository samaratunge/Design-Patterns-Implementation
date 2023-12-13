package design.pattern.decorator2;

public class HouseBlend extends Beverages{
	
	public HouseBlend() {
		description = "House Blend";
	}

	@Override
	public double cost() {
		return 4;
	}
}
