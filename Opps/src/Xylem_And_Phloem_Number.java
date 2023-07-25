
public class Xylem_And_Phloem_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 54324;
		int last = n % 10;
		n = n / 10;
		int sum = 0;
		while (n > 9) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		if ((last + n) == sum) {
			System.out.println("xylem");
		} else {
			System.out.println("phloem");
		}
	}

}
