package com.constructor.example;
class h{
	h(){
		this("g",4);
		System.out.println("0-argument");
	}
	h(String s,int i){
		this(1);
		System.out.println("2-argument");
	}
	h(int i){
		
		System.out.println("1-argument");
	}
}
public class Call_to_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 h h = new h();
}
}