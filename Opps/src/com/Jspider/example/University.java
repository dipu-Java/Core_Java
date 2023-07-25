package com.Jspider.example;
public class University {
    int hallTicketseq=0;
    void applyForExam(Student[]students,String collegeCode) {
    	
    	for(int i=0;i<students.length;i++) {
    		Student student=students[i];
    		if(student!=null) 
    			student.hallTicketNumber=collegeCode+"-A123CD-"+hallTicketseq++;
    	}
    }
}
