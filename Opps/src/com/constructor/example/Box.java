  package com.constructor.example;
   public class Box {
      int height;
      int weight;
      int length;     
      Box(){
      }      
      Box(int height,int weight,int length){
    	  this.height=height;
      	this.weight=weight;
      	this.length=length;
      }
      Box(int height)
{    	  
    	  // super();
    	  this.height=height;
    	  System.out.println(height);
      }
      void display() {
    	  System.out.println( height + weight + length);    	 
      }
      public static void main(String[] args) {  	
    Box b=new Box();   
    Box b1=new Box(10);    
    Box b2=new Box(6,7,8);     
    b.display();
    b1.display();
    b2.display();   
  	}
}
