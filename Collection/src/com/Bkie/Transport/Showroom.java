package com.Bkie.Transport;

import java.util.Collection;

public class Showroom {

	public static void main(String[] args) {
		Company bajaj = new Company();
		bajaj.add(new Bike("yamaha", 7567788));
		bajaj.add(new Bike("Ninja", 66896));
		for(int i=1;i<=bajaj.size();i++) {
			System.out.println(bajaj.get(i));
		}

	}

}
