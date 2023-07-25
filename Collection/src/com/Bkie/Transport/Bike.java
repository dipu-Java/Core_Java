package com.Bkie.Transport;

public class Bike {
	String name;
	int price;

	public Bike(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", price=" + price + "]";
	}
}
