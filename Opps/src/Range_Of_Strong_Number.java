
public class Range_Of_Strong_Number {

	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if (isStrong(i) == 1)
				System.out.println(i);
		}
	}

	public static int isStrong(int i) {
		int temp = i;
		int sum = 0;
		int flag = 0;
		while (i > 0) {
			int rem = i % 10;
			int fac = 1;
			for (int k = 1; k <= rem; k++) {
				fac = fac * k;
			}
			sum = sum + fac;
			i /= 10;
		}
		if (sum == temp) {
			flag = 1;
		}
		return flag;
	}

}
