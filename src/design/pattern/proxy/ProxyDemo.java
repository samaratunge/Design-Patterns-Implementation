package design.pattern.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		
		Mail mail = new ProxyMail("udara.s@sliit.lk");
		
		mail.display();
		//display from proxy
		mail.display();
		//display from proxy
		mail.display();
		mail.display();
		mail.display();
	}

}
