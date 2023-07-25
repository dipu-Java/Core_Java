
public class Method_Strong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=145;
  int result=strong(n);
  if(n==result) System.out.println("str");
  else System.out.println("not str");
	}
	public static int strong(int n) {
	
		
		int sum=0;

		while(n>0) {
			int fac=1;
			int rem=n%10;
			for(int i=1;i<=rem;i++) {
				fac=fac*i;
			}
			sum=sum+fac;
			n/=10;
		}
		return sum;
	}

}
