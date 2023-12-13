package design.pattern.proxy;

public class ProxyMail implements Mail{
	
	private PersonalMail realMail;
	
	private String recepient;
	
	public ProxyMail(String recepient) {
		this.recepient = recepient;
	}

	@Override
	public void display() {
		if(realMail == null){
			realMail = new PersonalMail(recepient);
		}
		realMail.display();
	}
}


