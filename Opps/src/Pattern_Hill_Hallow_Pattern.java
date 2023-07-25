
public class Pattern_Hill_Hallow_Pattern {

	public static void main(String[] args) {
		int n = 5;
		int s = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= s; j++) {
				if (j == 1 || j == s || i == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			s += 2;
			System.out.println();
		}
	}

}
