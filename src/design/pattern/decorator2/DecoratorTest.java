package design.pattern.decorator2;

public class DecoratorTest {

	public static void main(String[] args) {
		
		Beverages beverages = new DarkRoast();
		beverages = new Soy(beverages);
		beverages = new Mocha(beverages);
		beverages = new Whip(beverages);
		System.out.println(beverages.getDescription() + " => $" + beverages.cost());
		
		Beverages beverages2 = new Soy(new Whip(new Mocha(new SteamedMilk(new Espresso()))));
		System.out.println(beverages2.getDescription() + " => $" + beverages2.cost());
		
		Beverages beverages3 = new Mocha(new Whip(new Whip(new Decaf())));
		System.out.println(beverages3.getDescription() + " => $" + beverages3.cost());
		
		
		String description = new Whip(new SteamedMilk(new HouseBlend())).getDescription();
		double cost = new Whip(new SteamedMilk(new HouseBlend())).cost();
		System.out.println(description + " => $" + cost);
	}
}
