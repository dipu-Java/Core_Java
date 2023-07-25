
public class Method_Utility {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter number");
//		int n=s.nextInt();
//    System.out.println(length(n));
//    System.out.println( power(n,length(n)));
//    System.out.println(reverse(n));
//    System.out.println(fact(n));
//    int result=arm(n);
//    if(n==result) {
//  	  System.out.println("arm");
//    }
//    else {
//  	  System.out.println("not arm");  
//    }  
//	}
	public static int length(int n) {
		int length=0;
		while(n>0) {
			length++;
			n/=10;
		}
		return length;
	}
   public static int power(int base,int exp) {
	  int a=1;
	  for(int i=1;i<=exp;i++) {
		  a=a*base;
	  }
	  return a;
   }
   public static int reverse(int n) {
	   int rev=0;
	   while(n>0) {
		   int rem=n%10;
		  rev=rev*10+rem;
		  n/=10;
	   }
	   return rev;
   }
   public static int fact(int n) {
	   int fac=1;
	   for(int i=1;i<=n;i++) {
		   fac=fac*i;
	   }
	   return fac;
   }
   public static int arm(int n) {
	   int sum=0;
  	 int l=length(n);
  	 while(n>0) {
  		 int rem=n%10;
  		 int d=power(rem,l);
  	 sum=sum+d;
  		 n/=10;	 
  	 }
  	 return sum;
   }
   public static int strong(int n) {
		int sum=0;
		for(;n>0;n/=10)sum=sum+fact(n%10);
		return sum;
		
	}
   }

