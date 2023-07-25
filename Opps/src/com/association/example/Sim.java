package com.association.example;

public interface Sim {
     void call();
}
class Jio implements Sim{

	@Override
	public void call() {
		System.out.println("call via jio");
	}
	
}
class Airtel implements Sim{

	@Override
	public void call() {
		System.out.println("call via Airtel");
	}
	
}
class Vi implements Sim{

	@Override
	public void call() {
		System.out.println("call via Vi");
	}
	
}