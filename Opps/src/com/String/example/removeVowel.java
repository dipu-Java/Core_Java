package com.String.example;

public class removeVowel {
	public static void main(String[] args) {
		String s = "mIhairo";
//        char[]c=s.toCharArray();
		int  count=0;
		for (int i = 0; i < s.length(); i++) {
if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'
                 ||s.charAt(i)=='o'|| s.charAt(i) == 'u') 
        {
	count++;
//				System.out.print(count);
			}
if (s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'
||s.charAt(i)=='O'|| s.charAt(i) == 'U') 
{
count++;
//System.out.print(count);
}
//System.out.print(count);
//	  System.out.println(s.charAt(i)); 
		}
		System.out.print(count);
//     System.out.println(s.charAt(i));
	}

}
