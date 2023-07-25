package com.encapsulation.getSet;

class a {
	private int id;

	public void setId(int eid) {
		id = eid;
	}

	public int getId() {
		return id;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a a1 = new a();
		a1.setId(12);
		System.out.println(a1.getId());
	}

}
