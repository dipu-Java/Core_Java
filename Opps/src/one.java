
public class one {
	public static void main(String[] args) {
		int a = 1000;
		for (int i = 1; i <= 500; i++) {
			if (isStrong(i) == 1) {
				System.out.println(i);

			}
		}
	}

	public static int isStrong(int i) {
		int sum = 0;
		int temp = i;
		int flag = 0;
		while (i > 0) {
			int rem = i % 10;
			int e = 1;
			for (int j = 1; j <= rem; j++) {
				e = e * j;
			}
			sum = sum + e;
			i /= 10;

		}
		if (sum == temp) {
			flag = 1;
		}
		return flag;

	}
}
