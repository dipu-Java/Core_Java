package com.Bkie.Transport;

import java.util.Collection;

public class Company {
	Bike[] b = new Bike[5];
	int p = 0;

	public void add(Bike bb) {
		b[p++] = bb;
	}

	public Bike get(int index) {
		return b[index];
	}
	public int size() {
		return p;
	}

}
