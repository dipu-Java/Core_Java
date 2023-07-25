package com.constructor.example;
 class Customer3{
	 String cname;
	    String pid;
	    int pcost;
	    int quantity;
	    static int gst=10;
	   static  String Brand="honeywell";
	    static int discount=5;
		
	 Customer3(String cname, String pid, int pcost, int quantity) {
//			super();
			this.cname = cname;
			this.pid = pid;
			this.pcost = pcost;
			this.quantity = quantity;
		}
	 public void returnBill() {
		 int dis=discount*quantity*pcost/100;
		 System.out.println("your total amount is =" + (quantity*pcost-dis ));
	 }
 }
public class Customer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer3 c1=new Customer3("fjldsa","dafs",20,5);
		c1.returnBill();
	}

}
