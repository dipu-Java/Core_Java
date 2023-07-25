package com.datastructure;

public class SingleLinkedList {
	private Node head;
	private int count;

	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			count++;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(data);
		count++;
		return;
	}

	public Object get(int index) {
		Node curr = head;
		for (int i = 1; i <= index; i++) {
			curr = curr.next;
		}
		return curr.data;
	}

	public void set(int index, int data) {
		if (index <= -1 || index >= size())
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			head = new Node(data, head);
			count++;
			return;
		}
		Node curr = head;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
		curr.next = new Node(data, curr.next);
		count++;
		return;
	}

	public int size() {
		return count;
	}

	public static void main(String[] args) {
		SingleLinkedList sl = new SingleLinkedList();
		sl.add(56);
		sl.add(23);
		sl.add(24);
		sl.add(65);
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}
		sl.set(2, 90);
		System.out.println("------------------");
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		}

	}
}
