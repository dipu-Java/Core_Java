
public class method_strong {
     public static int factor(int n) {
    	 int fac=1;
    	 for(int i=1;i<=n;i++) {
    		 fac=fac*i;
    	 }
    	 return fac;
     }
     public static int strong(int n) {
    	 int sum=0;
    	 while(n>0) {
    		 int rem=n%10;
    		sum=sum+factor(rem);
    		 n/=10; 
    	 }
    	 return sum;
     }
     public static void main(String[]args) {
    	 int n=145;
    	 
    	 int res=strong(n);
    	 if(n==res) System.out.println("str");
    	 else System.out.println("not str");
     }
}
