
public class Dipu_Pattern {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || j == 1 || i == 5 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int a = 1; a <= 1; a++) {
				// if(i==1||a==2||a==3)

				System.out.print("  *");
			}
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == 3 || j == 2 || (j == 5 && j > 5))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == n || j == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
