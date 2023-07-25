package com.association.example;

public class Phone {
      Battery battery;
      Phone(Battery battery){
    	  this.battery=battery;
      }
      void phone(Sim s) {
    	  s.call();
      }
}
