package com.handleCustomeException;
class CheckException extends Exception {
	String s;

	public CheckException(String s) {
		this.s = s;
	}

	public CheckException() {
		System.out.println("there is no correct name inside the variable");
	}

	public void disp(String string) throws CheckException {
		if (!this.s.equals(string))
			throw new CheckException();
		else {
			System.out.println("programme executed successfully");
		}
	}
}

public class Demo1 {
	public static void main(String[] args) {
		CheckException c1 = new CheckException("manahad");
		try {
			c1.disp("okkk");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
