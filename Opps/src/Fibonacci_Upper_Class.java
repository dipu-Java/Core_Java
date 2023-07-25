
public class Fibonacci_Upper_Class {

	public static void main(String[] args) {
		int n = 1;
		int a = 0, b = 1, c;
		for (;;) {
			c = a + b;
			if (c <= 9) {
				System.out.println(c);

				a = b;
				b = c;
				n++;
			}

			else {
				break;
			}
		}
	}
}
