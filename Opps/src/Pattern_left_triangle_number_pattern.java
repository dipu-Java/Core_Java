
public class Pattern_left_triangle_number_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=5;
         int s=4;
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=s;j++) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=n;j++) {
        		if(j>=6-i) {
        			System.out.print(j);
        		}
        	}
        	System.out.println();
        	s--;
        }
	}

}
