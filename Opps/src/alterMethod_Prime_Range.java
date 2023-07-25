import java.util.Scanner;

public class alterMethod_Prime_Range {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st number");
		int start = s.nextInt();
		System.out.println("enter 2nd number");
		int end = s.nextInt();
		int a = 0;
		int length = 1;
		for (int n = start; n <= end; n++) {
			if (isPrime(n) == 1) {
				a = n;
				length++;
				if (length % 2 != 0)
					System.out.println(a);
			}
		}
	}

	static int isPrime(int n) {
		int flag = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			flag = 1;
		}
		return flag;
	}
}
