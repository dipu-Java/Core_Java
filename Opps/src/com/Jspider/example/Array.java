package com.Jspider.example;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int []a= {40,2,38,34,35};
 // int []b= {2,22,33,34,35};
  
  int largest=0;
 
for(int i=0;i<=a.length-1;i++) {
	if(a[i]>a.length) {
		largest=a[i];
	}
}

	System.out.println(largest);
}

}












