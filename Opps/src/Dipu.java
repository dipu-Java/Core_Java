
class car {
	static int cNo;

	static {
		cNo = 1000;
	}

	{
		cNo++;
	}
	int carNo;
	String carName;
	String carColor;

	car(String carName) {
		this.carNo = cNo;
		this.carName = carName;
		carColor = "white";
	}

	car(String carName, String carColor) {
		this.carNo = cNo;
		this.carName = carName;
		this.carColor = carColor;
	}

	void carinfo() {
		System.out.println("carNumber" + " " + carNo);
		System.out.println("carname" + " " + carName);
		System.out.println("carColor" + " " + carColor);
	}
}

public class Dipu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c1 = new car("alto", "blue");
		c1.carinfo();
		System.out.println();

		car c2 = new car("Range Rover", "black");
		c2.carinfo();
		System.out.println();

		car c3 = new car("audi");
		c3.carinfo();
	}

}
