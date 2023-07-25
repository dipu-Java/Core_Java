package com.abs.example;

public class room {
    public void room1(Switch s) {
    	s.switchOff();
    	s.switchOn();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       room r=new room();       
       r.room1(new fan());
	}

}
