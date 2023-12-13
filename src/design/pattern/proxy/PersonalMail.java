package design.pattern.proxy;

public class PersonalMail implements Mail{
	
	private String recepient;

	public PersonalMail(String recepient) {
		this.recepient = recepient;
		System.out.println("First time load from actual account");
		readMail(recepient);
	}

	public void readMail(String recepient){
		System.out.println("Loading the mail sent by " + recepient);
	}

	@Override
	public void display() {
		System.out.println("Displaying the mail of = " + recepient);
	}
}


