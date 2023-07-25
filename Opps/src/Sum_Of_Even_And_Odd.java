
public class Sum_Of_Even_And_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int even = 0;
		int odd = 0;
		int n = 1;
		while (n <= 10) {
			if (n % 2 == 0) {
				even = even + n;
			} else {
				odd = odd + n;
			}
			n++;
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
