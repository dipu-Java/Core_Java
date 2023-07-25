
public class Pattern_Hill_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
	       int s=1;
	       for(int i=1;i<=n;i++) {
	    	   for(int j=1;j<=n-i;j++) {
	    		   System.out.print(" ");
	    	   }
	    		   for( int j=1;j<=s;j++) {
	    			   System.out.print("*");
	    		   }
	    		   System.out.println();
	    	   
	       s+=2;
	    		  
	    		 
	    	   }
	}

}
