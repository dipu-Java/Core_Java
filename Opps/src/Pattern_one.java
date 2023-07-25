
public class Pattern_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=n;j++) {
    		 if(i==5 || j==3 || i+j==3 && j<=3)
    			 System.out.print("*");
    		 else System.out.print(" ");
    	 }
    	 System.out.println();
     }
	}

}
