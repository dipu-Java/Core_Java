package com.Block.example;
class car{
}
class audi extends car{
}
class benz extends car{}
class alto extends car{}
class driver{
	public void driver(car c) {
		System.out.println("driver drives");
	}
}
public class upCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		audi a=new audi();
     driver d=new driver();
     d.driver(a);
//     car c=new car();
//     c.driver();
	}

}
