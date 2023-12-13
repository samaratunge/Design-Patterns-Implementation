package design.pattern.factoryMethod;

class DarkRedColor implements IColor{

	@Override
	public void fill() {
		System.out.println("Dark Red Color");
	}
}

class DarkGreenColor implements IColor{

	@Override
	public void fill() {
		System.out.println("Dark Green Color");
	}
}

class DarkBlueColor implements IColor{

	@Override
	public void fill() {
		System.out.println("Dark Blue Color");
	}
}

/**
 * Generate Dark Colors
 * @author udara.s
 *
 */
public class DarkColorFactory extends ColorFactory{

	/**
	 * Generate Dark Colors
	 */
	@Override
	IColor generateColor(String color) {
		
		if(color.equals("red")){
			return new DarkRedColor();
		}else if(color.equals("green")){
			return new DarkGreenColor();
		}else if(color.equals("blue")){
			return new DarkBlueColor();
		}else{
			return null;
		}
	}
}
