
public class Fibonacci_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=8;
  int a=0,b=1,c;
  System.out.println(a + "\n"+ b);
  for(int i=1;i<=n;i++) {
	c=a+b;
	
	System.out.println(c);
	
	a=b;
	b=c;
	
  }
	}

}
