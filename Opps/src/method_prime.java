
public class method_prime {
         static boolean isPrime(int n) {
        	 if(n<=1) return false;
        	 	else 
        	 	{
        	 		for(int i=2;i<=n/2;i++) {
        	 			if(n%i==0) return false;
        	 			}
        	 		}
        	 return true;        	 
        }
    public static void main(String[]args) {
    	int n=7;
    	boolean b=isPrime(n);
    	if(b)System.out.println("prime");
    	else System.out.println("not prime");
    	
    }
}
