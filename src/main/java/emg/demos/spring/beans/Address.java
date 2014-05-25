package emg.demos.spring.beans;

public class Address {
	private String street;
	private String postcode;

	public Address () {
		super();
	}
	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public void init() {
		System.out.println("Address init: " + this);
	}

	public void destroy() {
		System.out.println("Address destroyed: " + this);
	}
}
