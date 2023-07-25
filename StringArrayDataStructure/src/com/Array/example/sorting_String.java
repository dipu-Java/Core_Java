package com.Array.example;

public class sorting_String {
	public static void main(String[] args) {
    String[]a= {"dipu","Rashmi","ipun","Mihir","Siba"};		
		int n=2;
		String b="";
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					b=a[j];
					a[j]=a[j+1];
					a[j+1]=b;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
    }
	
}
