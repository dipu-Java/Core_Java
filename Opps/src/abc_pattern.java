
public class abc_pattern {

	public static void main(String[] args) {
		int n = 5;
		int ch = 65;
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1) {
					ch = 65;
					System.out.print((char) ch + " ");
					ch++;
				} else {
					System.out.print((char) ch + " ");
					ch++;
				}
			}

			System.out.println();
		}
	}

}
