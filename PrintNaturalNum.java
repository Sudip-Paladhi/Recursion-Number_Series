package com.Recursion;

public class PrintNaturalNum {

	public static void main(String[] args) {
		int n=1;
		naturalNum(n);
	}
	
	public static void naturalNum(int a) {
		if (a == 11) return;
		System.out.println(a);
		naturalNum(a+1);
	}
}
