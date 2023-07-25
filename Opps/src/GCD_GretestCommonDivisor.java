
public class GCD_GretestCommonDivisor {

	public static void main(String[] args) {
		int a = 12;
		int b = 8;
		int d = 0;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				d = i;
			}
		}
		System.out.println(d);
	}

}
