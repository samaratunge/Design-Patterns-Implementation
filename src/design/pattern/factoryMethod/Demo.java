package design.pattern.factoryMethod;

public class Demo {

	public static void main(String[] args) {
		ColorFactory lightColorFactory = new LightColorFactory();
		lightColorFactory.generateColor("red").fill();
		lightColorFactory.generateColor("green").fill();
		lightColorFactory.generateColor("blue").fill();
		
		ColorFactory darkColorFactory = new DarkColorFactory();
		darkColorFactory.generateColor("red").fill();
		darkColorFactory.generateColor("green").fill();
		darkColorFactory.generateColor("blue").fill();
		
	}

}
