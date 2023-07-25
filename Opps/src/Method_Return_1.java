
public class Method_Return_1 {

	static void m1() {
		System.out.println("m1");
	}
	static int m2() {
		System.out.println("m2");
		return 50;
	}
	public static void main(String[]args) {
		m1();
		System.out.println();
		m2();
		int x=m2();
		int y=10+m2();
		System.out.println(m2());
		m3(m2());
		int z=m5();
		System.out.println(z);
	}
	static void m3(int x) {
		System.out.println("m3");
		System.out.println(x+10);
	}
	
	
	static int m5() {
		System.out.println("m5");
		return m2();
	}
}
