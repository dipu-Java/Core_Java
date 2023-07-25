package com.abs.example;

abstract class animalBehavour {
	abstract void sound();
	abstract void movement();	
}
 class dog extends animalBehavour
 {	
	 void sound() {
		 System.out.println("dog sound bow...");
	 }
	 void movement() {
		 System.out.println("dog moves like b.o.w");
	 }
 }
 class snake extends animalBehavour
 {
	 void sound() {
		
		 System.out.println("snake sound like shs...");
	 }
	 void movement() {
		 System.out.println(" snake move like s.h.s");
	 }
 }
