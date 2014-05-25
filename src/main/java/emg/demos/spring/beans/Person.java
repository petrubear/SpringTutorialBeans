package emg.demos.spring.beans;

public class Person {
	private long id;
	private String name;
	private int taxId;
	private Address address;

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person() {

	}

	public Person(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static Person getInstance(long id, String name) {
		System.out.println("Person factory method.");
		return new Person(id, name);
	}

	public void init() {
		System.out.println("Person init: " + this);
	}

	public void destroy() {
		System.out.println("Person destroy: " + this);
	}

	public void speak() {
		System.out.println("Hello Spring!!");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}

}
