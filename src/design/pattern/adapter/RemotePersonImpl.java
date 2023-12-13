package design.pattern.adapter;

public class RemotePersonImpl implements IRemotePerson{

	@Override
	public String getFirstName() {
		return "Nimal";
	}

	@Override
	public String getLastName() {
		return "Senevirathne";
	}

	@Override
	public String getAddressLine1() {
		return "No:50, New Kandy Road";
	}

	@Override
	public String getAddressLine2() {
		return "Malabe";
	}
}
