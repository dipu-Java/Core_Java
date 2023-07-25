import java.util.Scanner;

public class Reverse_sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("enter your total number");
		int n = s.nextInt();
		int rev = 0;
		int count = 0;
		int length = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);
		int temp = rev;
		while (rev > 0) {
			rev /= 10;
			length++;
		}
		rev = temp;
		System.out.println("enter your number");
		int a = s.nextInt();
		if (a > length) {
			System.out.println("enter number is not valid");
		}
		int r = 0;
		if (length > a) {
			r = length - a;
		}
		int e = 1;
		for (int j = 1; j <= r; j++) {
			e = e * 10;
		}
		int result = temp / e;
		int sum = 0;
		while (result > 0) {
			int z = result % 10;
			sum = sum + z;
			result /= 10;
		}
		System.out.println(sum);
	}
}
