
public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=7;
int count=0;
int l=1;
for(int i=1;i<=n;i++) {
	if(n%i==0) {
		count++;
	}
}
	if(count==2) {
		
	}
	else{
		System.out.println("not prime");
	}

	}

}
