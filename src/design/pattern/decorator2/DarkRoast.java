package design.pattern.decorator2;

public class DarkRoast extends Beverages{
	
	public DarkRoast() {
		description = "Dark Roast";
	}

	@Override
	public double cost() {
		return 1;
	}
}
