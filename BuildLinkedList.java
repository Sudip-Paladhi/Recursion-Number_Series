package com.Recursion;

public class BuildLinkedList {

	public static void main(String[] args) {
	   LinkedList l= new LinkedList();
	   l.add(10);
	   l.add(20);
	   l.add(30);
	   l.add(40);
	   l.add(50);
	   l.add(60);
	   l.add(70);
	   l.add(80);
	   l.remove(5);
	   l.reverse();
	   //l.add(4,55);
	   //l.get(0);
	   for (int i = 0; i < l.size(); i++) {
		   System.out.println(l.get(i));
	}


	}

}
