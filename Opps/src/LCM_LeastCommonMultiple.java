
public class LCM_LeastCommonMultiple {

	public static void main(String[] args) {
		int a = 12;
		int b = 6;
		int n = a > b ? a : b;
		for (;;) {
			if (n % a == 0 && n % b == 0) {
				break;
			}
			n++;
		}
		System.out.println(n);
	}

}
