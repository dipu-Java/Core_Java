package com.Array.example;

public class first_duplicate_element {

	public static void main(String[] args) {
      int[]a= {2,3,4,5,6,4,3,9,1};
      int count=0;
      int temp=0;
      for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) ) {
					count++;
//					if(count==1) {
						System.out.println(a[i]);
//						temp=temp+1;
					}
				}
			if(count>0) {
				break;
			}
      }
	}

}
