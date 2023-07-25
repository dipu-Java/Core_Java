package com.Block.example;
class f{
	static {
		System.out.println("static block...");
	}
	{
		System.out.println("non-static block...");
	}
	f(){
		System.out.println("no-arg constructor class f...");
	}
}
class g extends f{
	static {
		System.out.println("static block of class g...");
	}
	{
		System.out.println("non-static block of class g...");
	}
	g(){
		System.out.println("no-arg constructor class g...");
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new g();
	}

}
