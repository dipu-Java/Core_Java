package com.inherit.inheritance;
class shape{
	static String color;
	static {
		color="white";
	}
}
class circle extends shape{
	 void col1() {
		 System.out.println(color);
	 }
}
class triangle extends circle{
	void col2() {
		 System.out.println(color);
	}
}
class rectangle extends triangle{
	void col3() {
		 System.out.println(color);
	}
}
public class shape5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      rectangle r=new rectangle();
      r.color="blue";
      r.col3();
      r.col2();
      r.col1();
	}

}
