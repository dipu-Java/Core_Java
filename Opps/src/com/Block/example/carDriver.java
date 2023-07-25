package com.Block.example;
class Engine{
	String brand;
	int cc;
	Engine(String b,int cc){
		brand=b;
		this.cc=cc;
		System.out.println("brand ="+brand+" cc ="+cc);
	}
//	public String toString() {
//		return "brand"+brand+"cc"+cc;
//	}
}
class bus{
	Engine e;
	String name;
	double price;
	bus(Engine e,String name,double price){
		this.e=e;
		this.name=name;
		this.price=price;
	}
	public String toString() {
		return "car[name "+name+" price"+price +"]";
	}
}
public class carDriver {

	public static void main(String[] args) {
//		carDriver c=new carDriver();
		bus c=new bus(new Engine("applo",120),"range rover",100000);
//		c.e.brand="appolo";
//		c.e.cc=10000;
	}

}
