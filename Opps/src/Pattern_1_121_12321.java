
public class Pattern_1_121_12321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
	     int count=1;
	     for(int i=1;i<=n;i++) {
	    	 for(int j=1;j<=i;j++) {
	    		 System.out.print(j);
	    	 }
	    	 for(int j=i-1;j>=1;j--) {
	    		 System.out.print(j);
	    	 }
	    	 System.out.println();
	     }
	}
}