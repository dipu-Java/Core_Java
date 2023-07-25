package com.handleCustomeException;

class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super("the age you defined is inavalid...");
	}
}

class CheckAge {

	public void checkAge(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException();
		else {
			System.out.println("you are eligible for voting...");
		}
	}

}

public class Demo2 {
	public static void main(String[] args) {
		CheckAge ck = new CheckAge();
		try {
			ck.checkAge(14);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
