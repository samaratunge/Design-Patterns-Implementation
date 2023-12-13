package design.pattern.observer;


public class TestObserver {

	public static void main(String[] args) {
		
		Observer observer1 = new ObserverImpl("Observer 1");
		Observer observer2 = new ObserverImpl("Observer 2");
		Observer observer3 = new ObserverImpl("Observer 3");
		Observer observer4 = new ObserverImpl("Observer 4");
		Observer observer5 = new ObserverImpl("Observer 5");

		Subject subject = new SubjectImpl();
		subject.registerObserver(observer1);
		subject.registerObserver(observer2);
		subject.registerObserver(observer3);
		subject.registerObserver(observer4);
		subject.registerObserver(observer5);
		
		subject.setStatus("2222");
		subject.removeObserver(observer5);
		
		System.out.println();
		subject.setStatus("3333");
		
	}
}
