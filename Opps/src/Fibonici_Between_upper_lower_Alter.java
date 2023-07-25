
public class Fibonici_Between_upper_lower_Alter {

	public static void main(String[] args) {
		int upper = 125;
		int lower = 9;
		int a = 0, b = 1, c;
		int count = 1;
		for (;;) {
			c = a + b;
			if (c > upper) {
				break;
			}

			if (c >= lower) {
				if (count % 2 == 0) {
					System.out.println(c);
				}

			}
			a = b;
			b = c;
			count++;
		}

	}
}