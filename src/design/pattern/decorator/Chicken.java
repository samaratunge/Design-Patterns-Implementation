package design.pattern.decorator;

public class Chicken extends MealDecorator {

	Meal meal;

	public Chicken(Meal meal) {
		this.meal = meal;
	}

	@Override
	public String getDescription() {
		return meal.getDescription() + ", Chicken";
	}

	@Override
	public double cost() {
		return 50.0 + meal.cost();
	}
}
