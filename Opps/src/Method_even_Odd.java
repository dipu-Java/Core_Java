
public class Method_even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    boolean b=checkNumber(10);
    if(b) System.out.println("even");
    else System.out.println("odd");
	}
  public static boolean checkNumber(int n) {
	  if(n%2==0) return true ;
	  return false;
  }
}
