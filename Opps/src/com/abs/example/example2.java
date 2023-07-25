package com.abs.example;
 class bike {
}
class palsor{	
}
abstract class showroom {
	abstract void service(bike b);
	abstract void service( palsor p);
}
class mech1 extends showroom{
	void service(bike b) {
		System.out.println("bike service by mech1...");
	}
	void service(palsor p) {
		System.out.println("palsor service by mech1...");
	}
}
class mech2 extends mech1{
	void service(bike b) {
		System.out.println("bike service by mech2...");
	}
	void service(palsor p) {
		System.out.println("palsor service by mech2...");
	}
}
public class example2 {
	public static void main(String[] args) {
  bike b=new bike();
  palsor p=new palsor();
  showroom m=new mech2();
  m.service(b);
	}

}
