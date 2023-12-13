package design.pattern.decorator;

public class Rice extends Meal {
	
	public Rice() {
		description = "Rice";
	}

	@Override
	public double cost() {
		return 100.0;
	}
}


