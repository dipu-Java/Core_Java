
public class Method {

	void voteRegister(String name,int mob,int age,int sscRollNo,String Location) {
		if(age>17 && Location.equals("hyd")) {
			System.out.println("eligible for voting");
		}
		else {
			System.out.println("not eligible for voting");
		}
	}
	static void marry(String name,int age,int bankBalance) {
		
	}

}
