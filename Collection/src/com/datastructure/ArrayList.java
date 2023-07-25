package com.datastructure;

public class ArrayList {
	private Object[] a = new Object[5];
	private int p = 0;

	public int size() {
		return p;
	}

	public boolean isEmpty() {
		return (size() == 0);
	}

	public void add(Object data) {
		if (p >= a.length)
			increase();
		a[p++] = data;
	}

	public void increase() {
		Object[] arr = new Object[a.length + 3];
		for (int i = 0; i < a.length; i++) {
			arr[i] = a[i];
		}
		a = arr;
	}

	public void set(int index, Object data) {
		if (p >= size())
			increase();
		if (index <= -1 || index >= size())
			throw new IndexOutOfBoundsException();

		for (int i = size() - 1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = data;
		p++;
	}

	public Object get(int index) {
		return a[index];
	}

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(23);
		a1.add(11);
		a1.add(65);
		a1.add(9);
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("-----------");
		a1.set(2, 789);
		a1.set(4, 909);
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
	}
}
