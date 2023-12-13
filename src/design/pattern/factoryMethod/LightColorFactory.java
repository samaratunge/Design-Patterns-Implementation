package design.pattern.factoryMethod;

class LightRedColor implements IColor{

	@Override
	public void fill() {
		System.out.println("Light Red Color");
	}
}

class LightGreenColor implements IColor{

	@Override
	public void fill() {
		System.out.println("Light Green Color");
	}
}

class LightBlueColor implements IColor{

	@Override
	public void fill() {
		System.out.println("Light Blue Color");
	}
}

public class LightColorFactory extends ColorFactory{

	@Override
	IColor generateColor(String color) {
		if(color.equals("red")){
			return new LightRedColor();
		}else if(color.equals("green")){
			return new LightGreenColor();
		}else if(color.equals("blue")){
			return new LightBlueColor();
		}else{
			return null;
		}
	}

}
