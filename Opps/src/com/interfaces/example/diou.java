package com.interfaces.example;

interface bank12 {
	void interest();

	void m();
}

class axis implements bank12 {
	@Override
	public void interest() {
		System.out.println("rate of interest 10%");
	}

	public void m() {
		System.out.println("core java");
	}

}

public class diou {

	public static void main(String[] args) {
		Object o = new axis();
//       ((bank12) o).interest();
		bank12 b = (bank12) o;
		b.interest();
		b.m();
	}

}
