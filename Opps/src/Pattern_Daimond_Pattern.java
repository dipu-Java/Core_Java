
public class Pattern_Daimond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int space=n/2;
		int star=1;
		 for(int i=1;i<=n;i++) {
	    	   for(int j=1;j<=space;j++) {
	    		   System.out.print(" ");
	    	   }
	    		   for( int j=1;j<=star;j++) {
	    			   System.out.print("*");
	   }
	    		   if(i<=n/2) {
	    			   star+=2;
	    			   space--;
	    		   }
	    		   else {
	    			   star-=2;
	    			   space++;
	    		   }
	    		  System.out.println();
      }
    }
  }