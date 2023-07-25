package com.constructor.example;

public class z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Student4 s=new Student4();
  s.id=10;
  s.name="ram";
  s.age=20;
  s.display();
  Student4 s1=new Student4(s);
  s1.age=22;s1.id=11;
  s1.display();
  Student4 s2=new Student4(s1);
  s2.name="dipu";s2.id=12;
  s2.display();	}

}
class Student4{
	int id;
	String name;
	int age;
	Student4(){
		this.id=id;
		this.name=name;
		this.age=age;	
	}

	Student4(Student4 a){
		this.id=a.id;
		this.name=a.name;
		this.age=a.age;
		a.id=11;
		a.age=20;	
	}
	void display() {
		System.out.println(id+" "+ name+" "+age);	
	}
}	
	








