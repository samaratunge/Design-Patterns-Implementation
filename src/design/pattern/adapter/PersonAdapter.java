package design.pattern.adapter;

public class PersonAdapter implements IPerson{
	
	IRemotePerson remotePerson;
	
	public PersonAdapter(IRemotePerson remotePerson) {
		this.remotePerson = remotePerson;
	}

	@Override
	public String generateFullName() {
		for (int i = 0; i < 4; i++) {
			System.out.println(remotePerson.getFirstName() + " " + remotePerson.getLastName());
		}
		return remotePerson.getFirstName() + " " + remotePerson.getLastName();
	}

	@Override
	public String generateFullAddress() {
		for (int i = 0; i < 4; i++) {
			System.out.println(remotePerson.getAddressLine1() + ", " + remotePerson.getAddressLine2());
		}
		return remotePerson.getAddressLine1() + ", " + remotePerson.getAddressLine2();
	}

	

	
}
