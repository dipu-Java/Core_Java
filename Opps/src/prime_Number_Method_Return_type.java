
public class prime_Number_Method_Return_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=100;i++) {
	if(isPrime(i)==1) {
		System.out.println(i);
	}
  }
	}
	static int isPrime(int i) {
		int count=0;
		int flag=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			flag=1;
		}
	
		return flag;
	}

}
