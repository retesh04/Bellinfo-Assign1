package com.bellinfo.assign1;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int n = scan.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
			if (sum == n) {
				System.out.println("Given number is a perfect number");
			} else {
				System.out.println("Given number is not a perfect number");
			}
		}
	}
}
