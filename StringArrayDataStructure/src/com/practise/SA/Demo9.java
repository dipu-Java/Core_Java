package com.practise.SA;

public class Demo9 {

	int m1() {
		try {
			if(1==1) {
				return 2;
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			System.exit(0);
			return 3;
			
		}
		//System.out.println("Object o...");
		//return 3;
	}

	void m1(String i) {
		System.out.println("String i");
	}

	public static void main(String[] args) {
		Demo9 d = new Demo9();
		int m1 = d.m1();
		System.out.println(m1);
		//d.m1(null);
	}

}
