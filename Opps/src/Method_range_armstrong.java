import java.util.Scanner;
public class Method_range_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int start=s.nextInt();
		System.out.println("enter number");
		int end=s.nextInt();
		for(int i=start;i<=end;i++) {
			if(i==armstrong(i)) {
				System.out.println(i);
			}
		}
	}
	public static int count(int i) {
		int count=0;
		while(i>0) {
			count++;	
			i/=10;
		}
		return count;
	}
     public static int power(int base,int exp) {
    	 int res=1;
    	 for(int i=1;i<=exp;i++) {
    		 res=res*base;
    	 }
    	 return res;
     }
     public static int armstrong(int i) { 
    	 int sum=0;
    	 int l=count(i);
    	 while(i>0) {
    		 int rem=i%10;
    		 int d=power(rem,l);
    	 sum=sum+d;
    		 i/=10;	 
    	 }
    	 return sum;
     }

}
