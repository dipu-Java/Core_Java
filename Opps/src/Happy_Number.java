import java.util.Scanner;

public class Happy_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int n = s.nextInt();
		int sum = 0;
		while (n > 9) {
			sum = 0;
			while (n > 0) {
				int rem = n % 10;
				sum = sum + rem * rem;
				n /= 10;
			}
			n = sum;
		}
		if (n == 1)
			System.out.println("happy");
		else
			System.out.println("not happy");
	}
}
//49,97,130