package design.pattern.bridge;

public class Test {
	public static void main(String[] args) {
		TV lgLv = new LGTV();
		TV sonyTv = new SonyTV();

		new RemoteControllerImpl(new SonyTV()).on();
		new RemoteControllerImpl(new LGTV()).on();
		new RemoteControllerImpl(sonyTv).tune(5);
		
	}
}

