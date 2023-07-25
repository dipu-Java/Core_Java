import java.util.Scanner;
public class method_range_strong {
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
    	 Scanner s=new Scanner(System.in);
 		System.out.println("enter number");
 		int start=s.nextInt();
 		System.out.println("enter number");
 		int end=s.nextInt();
 		for(int n=start;n<=end;n++) {
    	 
    	if(n== strong(n)) {
    		System.out.println(n);
    	}
    	
     }
}
}
