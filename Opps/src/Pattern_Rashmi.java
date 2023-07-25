
public class Pattern_Rashmi {

	public static void main(String[] args) {
		int n=5;
		int b=1;
		 for(int i=1;i<=n;i++) {
        	 for(int j=1;j<=5;j++) {
        		 if((i==1&j<5)||j==1||(i==3)||j==5) 
        			 System.out.print("*");
        		 else System.out.print(" ");        		
	}
        	 for(int a=1;a<=1;a++) {     	
     			 System.out.print(" ");
     		 }
        	 for(int a=1;a<=1;a++) {          		       	     	
     			 System.out.print(" ");
     		 }
        	 for(int a=1;a<=1;a++) {        	     	
     			 System.out.print(" ");
     		 }
 
    
        	 
        	 
        	 for(int j=1;j<=5;j++) {
        		 if(i==1||j==1||(i==3)||j==5)
        			 System.out.print("*");    			 
        		 else System.out.print(" ");
	}
        	 for(int a=1;a<=1;a++) {     	
     			 System.out.print(" ");
     		 }
        	 for(int a=1;a<=1;a++) {          		       	     	
     			 System.out.print(" ");
     		 }
        	 for(int a=1;a<=1;a++) {        	     	
     			 System.out.print(" ");
     		 }
        	 
        	 
        	 
        	 
        	 for(int j=1;j<=5;j++) {
        		 if(i==1||i==3||i==n||i+j==3||i+j==9) 
        			 System.out.print("*");
        		 else System.out.print(" ");
	}
        	 for(int a=1;a<=1;a++) {     	
     			 System.out.print(" ");
     		 }
        	 for(int a=1;a<=1;a++) {          		       	     	
     			 System.out.print(" ");
     		 }
        	 for(int a=1;a<=1;a++) {        	     	
     			 System.out.print(" ");
     		 }
        	 
        	
        	 
        	 
        	 
        	 for(int j=1;j<=5;j++) {
        		 if(j==1||(i==3)||j==5)
        			 System.out.print("*");    			 
        		 else System.out.print(" ");
	}
        	 for(int a=1;a<=1;a++) {     	
     			 System.out.print(" ");
     		 }
        	 for(int a=1;a<=1;a++) {          		       	     	
     			 System.out.print(" ");
     		 }
        	 for(int a=1;a<=1;a++) {        	     	
     			 System.out.print(" ");
     		 }
        	 
        	 
        	 
        	 
        	 
        	 
        	 for(int j=1;j<=n;j++) {
        		 if(j==1||j==n||((j==b||j==n-b+1)&& i<=n/2+1))
        			 System.out.print("*");    			 
        		 else System.out.print(" ");
	}
        	 for(int a=1;a<=1;a++) {     	
     			 System.out.print(" ");
     		 }
        	 for(int a=1;a<=1;a++) {          		       	     	
     			 System.out.print(" ");
     		 }
        	 for(int a=1;a<=1;a++) {        	     	
     			 System.out.print(" ");
     		 }
        	 
        	 
        	 
        	 
        	 
        	 for(int a=1;a<=1;a++) {     	
     			 System.out.print("*");
     		 }
        	 System.out.println();
        	 b++;

}
	}
}
