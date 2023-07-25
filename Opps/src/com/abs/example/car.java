package com.abs.example;
abstract class Car {
	abstract void start();
	abstract void acelerate();
	abstract void stop();
}
class Audi extends Car {
	@Override
	void start() {
		System.out.println("audi vehicle start....");
	}
	@Override
	void acelerate() {
		System.out.println("audi run in 3rd gear....");
	}
	@Override
	void stop() {
		System.out.println("audi vehicle stop....");
	}
}
class Alto extends Car {
	@Override
	void start() {
		System.out.println("alto vehicle start....");
	}
	@Override
	void acelerate() {
		System.out.println("alto run in 3rd gear....");
	}
	@Override
	void stop() {
		System.out.println("alto vehicle stop....");
	}
}
