import java.util.Scanner;

public class Temp_Celcius_to_Fahrenhite {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int n = s.nextInt();
		// TODO Auto-generated method stub
		int sum = 0;
		sum = (n * 9 / 5) + 32;
		System.out.println(sum);
	}

}
