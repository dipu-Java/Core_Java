package com.abs.example;

 abstract public class sim {
        abstract void connectCall();
}
class jio extends sim{
	void connectCall() {
		System.out.println("call will be connect in jio sim");
	}
}