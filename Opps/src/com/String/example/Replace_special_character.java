package com.String.example;

public class Replace_special_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="@CORE#$JAVAcorejava$$*&";
       String temp=s.replaceAll("[^a-zA-Z0-9]", "");
       System.out.println(temp);
	}

}
