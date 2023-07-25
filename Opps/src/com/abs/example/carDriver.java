package com.abs.example;

public class carDriver {
	public void carDrive(Car c) {
		c.start();
		c.stop();
		c.acelerate();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carDriver c = new carDriver();
		c.carDrive(new Audi());
		Car c1 = new Audi();
		System.out.println(c1 instanceof Object);
	}

}
