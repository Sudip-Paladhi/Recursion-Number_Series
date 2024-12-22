package com.Recursion;

public class Factorial {

	public static void main(String[] args) {
		int c= fact(4);
System.out.println(c);
	}

	public static int fact(int a) {
		if(a==0) return 1;
		return a*fact(a-1);
	}
}