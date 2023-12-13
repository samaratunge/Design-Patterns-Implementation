package design.pattern.decorator;

public class Bread extends Meal{
	
	public Bread() {
		description = "Bread";
	}

	@Override
	public double cost() {
		return 80.0;
	}
}


