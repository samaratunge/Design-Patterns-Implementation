package design.pattern.decorator;

public class Vegetable extends MealDecorator {

	Meal meal;

	public Vegetable(Meal meal) {
		this.meal = meal;
	}

	@Override
	public String getDescription() {
		return meal.getDescription() + ", Vegetable";
	}

	@Override
	public double cost() {
		return 20.0 + meal.cost();
	}
}
