class b{
	private String name;
	b(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void mutatorName(String name) {
		this.name=name;
	}
}
public class encapsulation {

	public static void main(String[] args) {
		b b1=new b("siba");
		System.out.println(b1.getName());
		b b2=b1;
		b2.mutatorName("dipu");
		System.out.println(b2.getName());
	}
}
