package design.pattern.decorator2;

public abstract class Beverages {
	
	String description = "Beverages";
	
	public String getDescription(){
		return description;
	}
	public abstract double cost();
}
