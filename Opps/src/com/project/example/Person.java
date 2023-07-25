package com.project.example;

import java.util.Scanner;

public class Person {
	public static Browser customer() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the browser details \n");
		System.out.println("1.mozilla \n" + "2.chrome \n" 
		+ "3.safari");
		int choice=s.nextInt();
		switch(choice) {
		case 1:return new Mozilla();
		case 2:return new Chrome();
		case 3:return new safari();
		}
		return null;

	}
}
