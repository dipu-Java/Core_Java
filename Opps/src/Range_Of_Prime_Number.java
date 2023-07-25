
public class Range_Of_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int a = 0;
		int length = 1;
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
//		a=i;
//		length++;
				System.out.println(i);
//	zif(length%2!=0) {
//		System.out.println(i);
//	}
			}
		}
	}

}
