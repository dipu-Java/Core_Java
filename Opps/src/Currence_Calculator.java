
public class Currence_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt = 4600;
		int b = 0;
		if (amt >= 2000) {
			b = amt / 2000;
			System.out.println("2000" + " " + b);
			amt = amt % 2000;
		}
		if (amt >= 500) {
			b = amt / 500;
			System.out.println("500" + " " + b);
			amt = amt % 500;
		}
		if (amt >= 200) {
			b = amt / 200;
			System.out.println("200" + " " + b);
			amt = amt % 200;
		}
		if (amt >= 100) {
			b = amt / 100;
			System.out.println("100" + " " + b);

		}
	}
}