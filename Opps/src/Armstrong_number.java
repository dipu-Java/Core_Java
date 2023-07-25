
public class Armstrong_number {
	public static void main(String[] args) {
		int start = 1;
		int end = 50000000;
		for (start = 1; start <= end; start++) {
			isArmstrong(start);
		}
	}
	public static void isArmstrong(int n) {
		int count = 0;
		int temp = n;
		int sum = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		n = temp;
		while (n > 0) {
			int rem = n % 10;
			int b = 1;
			for (int i = 1; i <= count; i++) {
				b = b * rem;
			}
			sum = sum + b;
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println(temp + "  is armstrong");
		}
	}
}
