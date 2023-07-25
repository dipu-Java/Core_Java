
public class method_armstrong {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=371;
      int result=armstrong(n);
      if(n==result) {
    	  System.out.println("arm");
      }
      else {
    	  System.out.println("not arm");  
      }
	}
	public static int count(int n) {
		int count=0;
		while(n>0) {
			count++;	
			n/=10;
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
     public static int armstrong(int n) { 
    	 int sum=0;
    	 int l=count(n);
    	 while(n>0) {
    		 int rem=n%10;
    		 int d=power(rem,l);
    	 sum=sum+d;
    		 n/=10;	 
    	 }
    	 return sum;
     }
}
