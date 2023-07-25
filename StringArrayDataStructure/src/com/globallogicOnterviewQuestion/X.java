package com.globallogicOnterviewQuestion;

import java.io.IOException;

public class X extends Exception {
	public static void main(String[] args) {

		try {
			throw new IOException();
		} catch (RuntimeException | IOException e) {
			if (e instanceof IOException) {
//				e = new RuntimeException(e);
//				throw e;
			}
		}
	}
}
