import java.util.Scanner;
public class Pra {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
	int n=s.nextInt();
	int rem=0;
	int rev=0;
	int temp;
	while(true) {
		n++;
	 temp=n;
	while(temp>0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp/=10;
	}
if(rev==n) {
	 System.out.println(rev);

			}
	}
	}
	
}
