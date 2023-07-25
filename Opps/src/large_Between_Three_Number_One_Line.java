
public class large_Between_Three_Number_One_Line {

	public static void main(String[] args) {
		int a = 23;
		int b = 3642;
		int c = 423;

		int n = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println(n);
	}

}
