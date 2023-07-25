
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int fac = 1;
		int i = 1;
		while (i <= n) {
			fac = fac * i;
			i++;
		}
		System.out.println(fac);
	}

}
