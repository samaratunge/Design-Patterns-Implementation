package design.pattern.decorator;

public class Egg extends MealDecorator {

	Meal meal;

	public Egg(Meal meal) {
		this.meal = meal;
	}

	@Override
	public String getDescription() {
		return meal.getDescription() + ", Egg";
	}

	@Override
	public double cost() {
		return 30.0 + meal.cost();
	}
}
