import java.util.Scanner;
public class Magic_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		   System.out.println("enter number");
		   int n=s.nextInt();
//   int sum=0;
     while(n>9) {
    	int sum=0;
    	 while(n>0) {
    		 int rem=n%10;
    		 sum=sum+rem;
    		 n/=10;
    	 }
    	 n=sum;
     }
     if(n==1)System.out.println("magic number");
     else System.out.println("not magic number");
	}

}
//145,325,1729