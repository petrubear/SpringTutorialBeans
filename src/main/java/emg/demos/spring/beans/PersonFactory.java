package emg.demos.spring.beans;

public class PersonFactory {
	public Person createPerson(long id, String name) {
		System.out.println("Person factory class.");
		return new Person (id, name);
	}
}
