
public class largest_Number {

	public static void main(String[] args) {
		int n = 426869;
		int large = 0;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;

			if (rem > large) {
				large = rem;

			}
			n = n / 10;
		}
		System.out.println(large);
	}

}
