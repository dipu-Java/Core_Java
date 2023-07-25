
public class Automorphic_Number {
	public static void main(String[] args) {
		int n = 25;
		int s = n * n;
		int count = 0;
		int temp = n;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		int e = 1;
		for (int i = 1; i <= count; i++) {
			e = e * 10;
		}
		int result = s % e;
		if (result == temp) {
			System.out.println("automorphic");
		} else {
			System.out.println("not automorphic");
		}
	}

}
