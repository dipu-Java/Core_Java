
public class Length_Of_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=423542;
int count=0;
while(n>0) {
	int rem=n%10;
	count++;
	n=n/10;
}
System.out.println(count);
	}

}
