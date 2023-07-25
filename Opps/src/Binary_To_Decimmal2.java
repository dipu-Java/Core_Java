
public class Binary_To_Decimmal2 {

	public static void main(String[] args) {
		int bin = 1000;
		int dec = 0;
		int e = 1;
		while (bin > 0) {
			int rem = bin % 10;
			dec = dec + e * rem;
			e = e * 2;
			bin = bin / 10;
		}
		System.out.println(dec);
	}

}
