package design.pattern.decorator;

public abstract class Meal {
	
	String description = "Meal";
	
	public String getDescription() {
		return description;
	}

	public abstract double cost();
}

