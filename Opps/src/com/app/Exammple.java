package com.app;
interface A{
	
}
interface b extends A{
	
}
public class Exammple {
	public static void main(String[] args) {
		int n = 5;
		int a=1;
		for (int i = 1; i <= n; i++) {
			if(i%2!=0)
			for (int j = 1; j <= n; j++) {
				System.out.print(a);
				if(j<n)a++;
			}
			else
			for(int j=0;j<=n;j++) {
				System.out.print(a);
				if(j<n)a++;
			}
			System.out.println();
		}
	}
}
