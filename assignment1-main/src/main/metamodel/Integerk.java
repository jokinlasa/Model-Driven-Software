package main.metamodel;

public class Integerk {
	String integer;
	int value;
	
	public Integerk(String integer, int value) {
		super();
		this.integer = integer;
		this.value = value;
	}
	
	
	public String getInteger() {
		return integer;
	}
	public void setInteger(String integer) {
		this.integer = integer;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
