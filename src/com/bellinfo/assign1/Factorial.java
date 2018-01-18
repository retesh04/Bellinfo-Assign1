package com.bellinfo.assign1;

import java.util.Scanner;

public class Factorial {

	private static Scanner scan;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int n = scan.nextInt();
		int result = 1;
		for (int i = 1;i<=n;i++) {
			result= result * i;
				}
		System.out.println("Factorial of entered number is: " +result);
		}
}