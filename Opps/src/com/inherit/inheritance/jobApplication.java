package com.inherit.inheritance;
class human{
	String name;
	int age;
	String gender;
	human(String name,int age,String gender ){
		this.name=name;
		this.age=age;
		this.gender=gender;
		
   }
//	public void displayDoctor() {
//		System.out.println("name  "+name);
//		System.out.println("age  "+age);
//		System.out.println("gender  "+gender);
//		System.out.println("specialist "+specialist);
//	}
}
class doctor extends human{
	String specialist;
	doctor(String name,int age,String gender,String specialist){
		super(name,age,gender);
		this.specialist=specialist;
	}
	public void displayDoctor() {
		System.out.println("name  "+name);
		System.out.println("age  "+age);
		System.out.println("gender  "+gender);
		System.out.println("specialist "+specialist);
	}
}
class engineer extends human{
	String designation;
	engineer(String name,int age,String gender,String designation){
		super(name,age,gender);
		this.designation=designation;
	}
   public	void displayEngineer() {
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("gender "+gender);
		System.out.println("designation "+designation);
   }
 }
public class jobApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       doctor d=new doctor("siba",25,"male","physiotherapist");
//       doctor d=new doctor();
//      d.specialist="Physic";
       d.displayDoctor();
    engineer e=   new engineer("dipu",25,"male","waste mechanical engineer");
    
    e.displayEngineer();
       
  
	}

}
