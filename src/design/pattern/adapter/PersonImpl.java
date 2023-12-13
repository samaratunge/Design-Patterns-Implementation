package design.pattern.adapter;

public class PersonImpl implements IPerson{

	@Override
	public String generateFullName() {
		return "Udara Samaratunge";
	}

	@Override
	public String generateFullAddress() {
		return "No:100, Kandy Road, Gampaha";
	}
}
