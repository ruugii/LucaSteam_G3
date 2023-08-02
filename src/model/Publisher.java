package model;

public class Publisher {
	String name;

	public Publisher(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Publisher [name=" + name + "]";
	}	
}
