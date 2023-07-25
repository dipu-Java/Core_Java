package com.practise.SA;
public class MainClass {
	public static void main(String[] args) {
		String s = "java is easy";
		String s1 = "";String a1 = "";
		int i = 0;int j = 0;int count = 0;
		int a2 = 0;
		int len = s.length();
		char[] c = s.toCharArray();
		while (len > i) {
			s1 = "";
			while (len > i && c[i] != ' ') {
				s1 += c[i];
				i++;
			}
			count++;
			if(count==2) {
				a2=i-1;
				while(a2>=j) {
					s1+=c[a2];
					a2--;
				}
			}
			System.out.print(s1+" ");
			i = i + 1;
			j=i;
		}

	}
}
