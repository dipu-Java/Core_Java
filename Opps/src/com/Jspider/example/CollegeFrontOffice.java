  package com.Jspider.example;

    public class CollegeFrontOffice {
	public static void main(String[] args) {
	      
	      Student s1=new Student();
	      s1.sno=101;
	      s1.sname="hk";
	     s1.course="cj";
	     s1.fee=2500;
	     
	     Student s2=new Student();
	     s2.sno=102;
	     s2.sname="bk";
	    s2.course="aj";
	    s2.fee=2000;
	    
	    Student s3=new Student();
	    s3.sno=103;
	    s3.sname="pk";
	   s3.course="sql";
	   s3.fee=1000;
	   
	College clg=new College();
	   clg.join(s1);
	   clg.join(s2);
	   clg.join(s3);
	   
	   University ou=new University();
	   ou.applyForExam(clg.students,"hkc");
	   clg.display();
		}
}
