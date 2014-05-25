package emg.demos.spring.beans;

public class Animal {
	private String name;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}
	
	public void init() {
		System.out.println("Animal init: " + this);
	}

	public void destroy() {
		System.out.println("Animal destroyed: " + this);
	}
}
