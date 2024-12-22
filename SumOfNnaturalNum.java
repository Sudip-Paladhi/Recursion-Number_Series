package com.Recursion;

public class SumOfNnaturalNum {

	public static void main(String[] args) {
		int n=1;
		int a=10;
		int sum=0;
		sumOfNum(n,a,sum);
	}
	
	public static void sumOfNum(int a, int n, int sum) {
		if(a==n) {
			sum+=a;
			System.out.println(sum);
			return;
		}
		sum+=a;
		sumOfNum(a+1, n, sum);
	}

}
