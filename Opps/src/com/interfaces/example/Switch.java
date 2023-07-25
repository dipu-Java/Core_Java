package com.interfaces.example;

interface Switch {
	void on();

	void off();
}

class fan implements Switch {

	@Override
	public void on() {
		System.out.println("fan switch is on");
	}

	@Override
	public void off() {
		System.out.println("fan switch is off");
	}

}

class bulb implements Switch {

	@Override
	public void on() {
		System.out.println("fan switch is on");
	}

	@Override
	public void off() {
		System.out.println("fan switch is off");
	}

}