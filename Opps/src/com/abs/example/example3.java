package com.abs.example;
abstract class h{
	static {
		System.out.println("fh");
	}
	{
		System.out.println("ge");
	}
	int i=10;
	static int j=1;
	h(){
		this(1);
	}
	h(int i){
	this("d");	
	}
	h(String s){
		
	}
	protected abstract void sys();
}
class i extends h{
	 protected void sys() {
		// TODO Auto-generated method stub
   System.out.println(super.i);
   System.out.println(super.j);
	}
}
public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       h a=new i();
       a.sys();
	}

}
