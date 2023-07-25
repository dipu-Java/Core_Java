
public class Niven_Or_Harsad_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=27;
int sum=0;
while(n>0) {
	int rem=n%10;
	sum=sum+rem;
	n=n/10;
}
if(n%sum==0) {
	System.out.println("it is nuven number");
}
else {
	System.out.println("not nuven");
}
	}

}
