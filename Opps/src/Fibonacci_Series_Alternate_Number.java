
public class Fibonacci_Series_Alternate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a=0,b=1,c;
				
		System.out.println(a + "\n"+ b);
		int count=1;
		int d=0;
		for(int i=3;i<=n;i++) {
			c=d+b;
		
			if(count%2!=0) {
         	System.out.println(c);

			}
			
			d=b;
			b=c;
		    count++;
		
	}
	}
}
