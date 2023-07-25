   package com.constructor.example;
   class Student1{
	int id=10;
	String name="ram";
	int age=22;;
	Student1(){
		this.id=id;
		this.name=name;
		this.age=age;
	System.out.println(id+" "+ name+" "+age);		
	}
	Student1(Student1 a){
		this.id=a.id;
		this.name=a.name;
		this.age=a.age;
		a.id=11;
		a.age=20;
		System.out.println(a.id+" "+ a.name+" "+a.age);			
		a.id=12;
	   a.name="dipu";
	   System.out.println(a.id+" "+ a.name+" "+a.age);	
	}
}
public class copy_conStructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student1 s=new Student1();
   Student1 s1=new Student1(s);
  // Student1 s2=new Student1(s1);
   
	}

}
