package com.inherit.inheritance;

interface vegitable {
	default void washVeg() {
      System.out.println("wash it with luke warm water");
	}
}
class carrot implements vegitable{
	public void prepareHalwa() {
		System.out.println("carrot halwa  is delicious");
	}

	
}
class potato implements vegitable{
	public void prepareFries() {
		System.out.println("potato french fries  is delicious");
	}
}
class shopkeeper{
	public vegitable sale(String vegName) {
		if(vegName.equalsIgnoreCase("carrot"))
			return new carrot();
		if(vegName.equalsIgnoreCase("potato"))
			return new potato();
		System.out.println();
		return null;
	}
}
public class demo1 {

	public static void main(String[] args) {
//          shopkeeper shop=new shopkeeper();
//          vegitable v=shop.sale("carrot");
//          v.prepareHalwa();
	}

}
