package com.bellinfo.assign1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int n = scan.nextInt();
		int n1=0, n2=1,n3,count = 30;
		System.out.println(n1+" "+n2);
		for(int i=2;i<count;i++) {
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}

	}

}
