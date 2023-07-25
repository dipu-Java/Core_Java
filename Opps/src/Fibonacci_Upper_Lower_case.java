
public class Fibonacci_Upper_Lower_case {

	public static void main(String[] args) {
		int upper = 125;
		int lower = 9;
		int a = 0, b = 1, c;
		for (;;) {
			c = a + b;
			if (c > upper) {
				break;
			}

			if (c >= lower) {
				System.out.println(c);
			}
			a = b;
			b = c;

		}
	}

}
