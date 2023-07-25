
public class Strong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145;
		int rem = 0;
		int sum = 0;
		int temp = n;
		while (n > 0) {
			rem = n % 10;
			int fac = 1;
			for (int i = 1; i <= rem; i++) {
				fac = fac * i;
			}
			sum = sum + fac;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("strong");
		} else {
			System.out.println("not strong");
		}
	}
}