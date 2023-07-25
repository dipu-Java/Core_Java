package com.abs.example;

public class Car1 {
	public void start() {
	}

	public void accelerate() {
	}

	public void stop() {
	}
}

class Bmw extends Car1 {
	public void start() {
		System.out.println("start with digital press");
	}

	@Override
	public void accelerate() {
		System.out.println("upto 150km/h");
	}

	@Override

	public void stop() {
		System.out.println("nitrous suspension break");
	}
}

class Mercedez extends Car1 {
	public void start() {
		System.out.println("start with digital press");
	}

	@Override
	public void accelerate() {
		System.out.println("upto 180km/h");
	}

	@Override

	public void stop() {
		System.out.println("oil break..");
	}
}

class Driver {
//	public void drive(Mercedez m) {
//		m.start();
//		m.accelerate();
//		m.stop();
//	}
//
//	public void drive(Bmw b) {
//		b.start();
//		b.accelerate();
//		b.stop();
//	}

	public void carDrive(Car1 c) {
		c.start();
		c.stop();
		c.accelerate();
	}

}
