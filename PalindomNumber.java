package com.Recursion;

public class PalindomNumber {

	public static void main(String[] args) {
		int n= 151;
		int temp=0;
		if(isPalindom(n, temp) ==n) System.out.println(n +" is a Palindom number");
		else System.out.println(n +" is not a Palindom number");

	}
	
	public static int isPalindom(int n, int temp) {
		if(n==0) return temp;
		temp= (temp*10)+(n%10);
		return isPalindom(n/10, temp);
	}

}
