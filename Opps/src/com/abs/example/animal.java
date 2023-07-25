package com.abs.example;

public class animal {
  public void animal1(animalBehavour b) {
	  b.sound();
	  b.movement();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   animal a=new animal();
   a.animal1(new dog());
   a.animal1(new snake());
	}

}
