package com.constructor.example;

public class Customer {
    String cname;
    int pid;
    int pcost;
    int quantity;
    static int gst=10;
   static  String Brand="honeywell";
    static int discount=10;	
	public Customer(String cname, int pid, int pcost, int quantity) {
//		super();
		this.cname = cname;
		this.pid = pid;
		this.pcost = pcost;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", pid=" + pid + ", pcost=" + pcost + ", quantity=" + quantity + "]";
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPcost() {
		return pcost;
	}
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public static int getGst() {
		return gst;
	}


	public static void setGst(int gst) {
		Customer.gst = gst;
	}


	public static String getBrand() {
		return Brand;
	}


	public static void setBrand(String brand) {
		Brand = brand;
	}


	public static int getDiscount() {
		return discount;
	}


	public static void setDiscount(int discount) {
		Customer.discount = discount;
	}


	public static void main(String[] args) {
		Customer customer1=new Customer("dipu", 2, 500, 3);
		
		returnTotalBill(customer1);
	}

	private static void returnTotalBill(Customer customer1) {
		// TODO Auto-generated method stub
		int totalAmountAfterDis=customer1.quantity*customer1.getPcost()-5;
		System.out.println(totalAmountAfterDis);
		
	}
    
    	
}
