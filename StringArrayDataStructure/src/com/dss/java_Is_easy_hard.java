package com.dss;

public class java_Is_easy_hard {
	public static void main(String[] args) {
		String s = "java is very easy";
		String s2 = "hard";
		int j = 0;
		int t = -1;
		char c6 = ' ';
		String s4 = "";
		String s3 = "";
		String temp = "";
		int k1 = 0;
		char[] c = s.toCharArray();
		for (k1 = s.length() - 1; k1 >= 0; k1--) {
			if (s.charAt(k1) == ' ') {
				t = k1;
				break;
			}
		}
		s4 = s.substring(t + 1);
		char[] c5 = s4.toCharArray();
//		if(t!=-1&&t<s.length()-1) {
//			s4=s.charAt(t+1);
//		}
		System.out.println(c5);
		for (j = 0; j < s.length(); j++) {

			if (c5.equals(c[j])) {
				break;
			}
			temp += c[j];
		}
//		String t = "";
//		for (int k = j + 1; k < s.length(); k++) {
//			t += c[k];
//			if (c[k] == ' ') {
//				continue;
//			}
//		}			
//			if (c[k] == ' ') {
//				break;
//			}

		s3 += temp + s2 + " ";
		System.out.print(s3);
	}
}
