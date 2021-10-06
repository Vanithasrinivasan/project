package org.interview_programs;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		CheckArmstrongNumber();
		CountAndPrintArmstrongNumberFrom0to1000() ;
              system.out.println("hello");
		
	}
	public static void CheckArmstrongNumber() {
		int n,a,i=0,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		
		a=n;
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			
		}
		if(n==a) {
			System.out.println("The number is Armstrong");
		}
		else {
			System.out.println("The number is not Armstrong");
		}
		
		}
	public static void CountAndPrintArmstrongNumberFrom0to1000() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int c=0;
		for(int n1 = 1;n1>1000;n1++) {
		int a,i,j=0;
		a=n1;
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
			
		}
		if(j==n1) {
			System.out.println("Armstrong number is:"+j);
			c++;
		}
		
			System.out.println("count of armstrong number is:"+c);
		}
		
			
		}
		
	}
	


         
