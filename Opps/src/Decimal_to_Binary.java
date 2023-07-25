
public class Decimal_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin = 0;
		int dec = 8;
		int e = 1;
		while (dec > 0) {
			int rem = dec % 2;
			bin = bin + e * rem;
			e = e * 10;
			dec = dec / 2;
		}
		System.out.println(bin);
	}

}
