
public class pattern_heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
	    	   for(int j=1;j<=15;j++) {
	    		 if((j>=4-i&&j<=4+i)||(j>=12-i&&j<=12+i))System.out.print("*");
	    		 else System.out.print(" ");
	}
	    	   System.out.println();

}
	}
}
