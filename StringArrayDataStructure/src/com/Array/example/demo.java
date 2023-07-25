package com.Array.example;

public class demo {
	public static void main(String[] args) {
		int[] a = {1, 2, 4, 6, 3, 8, 3, 8,4 ,2,1,1};
		int tem = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) ) {
					count++;
//					/tem = a[j];
					if(count==1) {
					System.out.print(a[j]+" , ");
					}
					
				}
			}
		}
//		System.out.println(".............");
//		int b = 0;
//		for (int k = 0; k < a.length; k++) {
//			if (a[k] != a[j]) {
//				b = a[k];
//				System.out.println(b);
//			}
//			
//		}
	}
}
