package com.Recursion;

public class Fibonachi {
     public static void main(String[] args) {
         int a=0; 
         int b=1;
         System.out.print(a + " "+ b+ " ");
         int n= 10;
         printFibonachi(a,b,n-2);
     }
     
     public static void printFibonachi (int a, int b, int n){
    	 if(n==0) return;
    		 int c= (a+b);
    	 System.out.print(c +" ");
    	 printFibonachi(b, c, n-1);
     }

}