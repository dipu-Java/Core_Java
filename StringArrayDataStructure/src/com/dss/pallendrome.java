package com.dss;

public class pallendrome {

	public static void main(String[] args) {
		String s = "madam";
		int start=0;
		int end=s.length()-1;
		if(isPallendrume(s,start,end)) {
			System.out.println("pallendrume");
		}else {
			System.out.println("not a pallendrume");
		}
	}

	 static boolean isPallendrume(String s, int start, int end) {
		 if(s.charAt(start)!=s.charAt(end)) {
			 start++;
			 end--;
		return false;
		 }
		return true;
	}

}
