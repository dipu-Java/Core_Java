package com.String.example;

public class example1 {
//	public static void main(String[] args) {
//		String s = "java";
//		String temp="";
//		for(int i=s.length()-1;i>=0;i--) {
//			temp+=s.charAt(i);
//		}
//		System.out.println(temp);
//		
//	}
//}
//class example3{
//	public static void main(String[] args) {
//		String s="mihir";
//		String temp1="";
//		char[]c=s.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			for(int j=i+1;j<c.length;j++) {
//				if(c[i]==c[j]) {
//					c[i]=' ';
//				}
//			}
//		}
//		for(int i=0;i<c.length;i++) {
//			if(c[i]!=' ') {
//				temp+=c[i];
//			}
//		}
//		System.out.println(temp);
//	}

	
	
	
	
	
	// reverse each word
//	class example4{
//	public static void main(String[] args) {
//		String s="core java";
//		String s1="";
//		int i=0;
//		int len=s.length();
//		char[]c=s.toCharArray();
//		int j=0;
//		while(j<len) {
//			while(j<len&&c[j]!=' ') {
//				j++;
//			}
//			int k=j-1;
//			String temp="";
//			while(i<=k) {
//				temp+=c[k];
//				k--;
//			}
//			s1+=temp+" ";
//			j=j+1;
//			i=j;
//		}
//		System.out.println(s1);
//	}	

	
	
	
	
	
	
	
	
	
	// occurance position
//	class example5{
//	public static void main(String[] args) {
//		String s="banana";
//		occurance(s);
//	}
//
//public static void occurance(String s) {
//	// TODO Auto-generated method stub
//	while(s.length()>0) {
//		char c=s.charAt(0);
//		String temp=s.replace(c+"","");
//		int count=s.length()-temp.length();
//		System.out.println("position is"+c+" "+count);
//		s=temp;
//	}
//}
//	}

	
	
	
	
	
	
	
	
	
	// find non-repeated character
//	public static void main(String[] args) {
//		
//	String s="madam";
//	while(s.length()>0) {
//		char c=s.charAt(0);
//		String temp=s.replace(c+"","");
//		int count=s.length()-temp.length();
//		if(count==1) {
//			System.out.println(c);
//		}
//		s=temp;		
//	}
//	}
	// replace char with its occurance position
//	public static void main(String[] args) {
//		String s="mihir";
//	  char[]c=s.toCharArray();
//	  String temp="";
//	  char a=s.charAt(1);
//	  int count=0;
//	  for(int i=0;i<c.length;i++) {
//		  if(c[i]==a) {
//			  count++;
//			  temp+=count;
//		  }
//		  temp+=c[i];
//	  }
//	  System.out.println(temp);
//	}
//  }

	
	
	//remove white Space
	public static void main(String[] args) {

		String s="core java";
		String temp="";
		char[]c=s.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			for(int j=i+1;j<c.length;j++) {
//				if(c[i]==' ') {
//					temp+=c[i];
//				}
//			}
//		}
//		for(int i=0;i<c.length;i++) {
//			if(c[i]!=' ') {
//				temp+=c[i];
//			}
//		}
//		System.out.println(temp);
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ') {
				temp+=c[i];
			}
		}
		System.out.println(temp);
	}
}



















