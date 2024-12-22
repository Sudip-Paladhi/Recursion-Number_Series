package com.Recursion;

public class ArmstrongNumber {

	public static void main(String[] args) {
		 for(int i=1; i<=300; i++) {
			 int n=i;
			 int c=count(n);
		if(isArmstrong(n,c)==n) System.out.println(n +" is a Armstrong number");
		else System.out.println(n +" is not a Armstrong number");
		 }
	}
	
	public static int count(int n) {
		if(n==0) return 0;
		return 1+count(n/10);
	}
	
	public static int isArmstrong(int n, int c) {
		if(n==0) return 0;
		return (int) Math.pow(n%10, c) + isArmstrong(n/10, c);
	}
}