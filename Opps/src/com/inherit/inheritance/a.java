package com.inherit.inheritance;

class phone {
	static void call() {
		System.out.println("call is coming");
	}
}

//static method are bonded at compile time
class cameraPhone extends phone {
	void takePhoto() {
		System.out.println("take photo");
	}

	static void call() {
		System.out.println("sub class call");
	}
}

class smartPhone extends cameraPhone {
	void instal() {
		System.out.println("instal the application");
	}

	static void call() {
		System.out.println("sub1 class call");
	}
}

public class a {
	public static void main(String[] args) {
		smartPhone s = new smartPhone();
		s.call();
	}
}
