
public class Reverse_Program_By_Using_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 57568;
		int rev = 0;
		for (; n > 0; n /= 10) {
			rev = rev * 10 + n % 10;
		}
		System.out.println(rev);
	}

}
