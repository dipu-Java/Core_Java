package com.Jspider.example;

public class College {
	 Student []students=new Student[60];
	    int index=0;
	    
	   void join(Student s) {
	    	students[index++]=s;
	    	System.out.println("student"+(index)+"is stroed");
	    }
	    void display() {
	    	for(int i=0;i<index;i++) {
	    		System.out.println("nStudents details"+(i+1));
	    		students[i].display();
	    	}
	    }
}
