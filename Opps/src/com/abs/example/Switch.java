package com.abs.example;

abstract public class Switch {
   abstract void switchOn();
   abstract void switchOff();
}
 class fan extends Switch{

	@Override
	void switchOn() {
    System.out.println(" fan switch is on");		
	}

	@Override
	void switchOff() {
		System.out.println(" fan switch is off");
	}

}
 class bulb extends Switch{

		@Override
		void switchOn() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void switchOff() {
			// TODO Auto-generated method stub
			
		}

	}
 class ac extends Switch{

		@Override
		void switchOn() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void switchOff() {
			// TODO Auto-generated method stub
			
		}

	}
 
 
 