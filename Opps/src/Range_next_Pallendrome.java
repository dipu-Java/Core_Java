import java.util.Scanner;

public class Range_next_Pallendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int n = s.nextInt();
		int i = n;
		
		while (i > 0) {
			int n1 = i;
			int rev = 0;
			while (n1 > 0) {
				int rem = n1 % 10;
				rev = rev * 10 + rem;
				n1 /= 10;
			}
			if (i == rev) {
				System.out.println(rev);
				break;
			}
			i++;
		}
	}

}
