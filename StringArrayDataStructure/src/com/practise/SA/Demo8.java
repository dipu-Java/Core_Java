package com.practise.SA;

public class Demo8 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) throws Exception {

		Demo8 d = new Demo8();
		d.start();
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				d.join();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
