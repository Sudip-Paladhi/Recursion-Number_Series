package com.Recursion;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=10;
		if(isPrime(a, a/2)) System.out.println("Prime number");
		else System.out.println("not as prime number");

	}
	
	public static boolean isPrime(int n, int i) {
		if(n<=1) return false;
		if(i==1) return true;
		if(n%i == 0) return false;
		
		return isPrime(n, i-1);
	}
}
