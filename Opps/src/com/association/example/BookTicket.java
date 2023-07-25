package com.association.example;
import java.util.Scanner;
class Theatre{
	int seat=50;
	static Theatre t;
	private Theatre() {		
	}
	public static Theatre getInstance() {
		if(t==null) {
			t=new Theatre();
		}
		return t;
	}
	public void bookTicket(int n) {
		if(n>seat) {			
			System.out.println("not available");
		}
		seat=seat-n;
		System.out.println("available seat  "+seat);
	}
}
public class BookTicket {

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("book ticket");
  int n=s.nextInt();
  Theatre t1=Theatre.getInstance();
  t1.bookTicket(n);
	}

}
