package com.ClassCalling.example;

public class Ac {

	int temp;
	boolean on = false;

	void increase() {
		temp = 23;
		System.out.println("ac is on :temp is" + temp);
	}

	void increaseTemp() {
		if (on == false) {
			System.out.println("first switch on the ac");
			return;
		}
		temp++;
		System.out.println("temp increase");
	}

	public static void main(String[] args) {
		Ac ac1 = new Ac();
		ac1.increaseTemp();
		ac1.increase();
	}
}
