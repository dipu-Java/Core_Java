package com.inherit.inheritance;

public class example {

	public static void main(String[] args) {
//   System.out.print("/\\/\\");
		String s="mihir";
		char[]c=s.toCharArray();
		char temp=' ';
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++){
				if(c[i]>c[j]) {
					temp=c[j];
					c[j]=c[i];
					c[i]=temp;
				}
			}
		}
		System.out.println(c);
	}

}
