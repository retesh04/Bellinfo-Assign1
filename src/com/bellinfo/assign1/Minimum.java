package com.bellinfo.assign1;

import java.util.Scanner;

public class Minimum {

	public static void main(String[] args) {
		int max, min;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int n = scan.nextInt();
		System.out.println("Enter" + n + "number");
		min = scan.nextInt();
		for (int i = 1; i < n; i++) {
			max = scan.nextInt();
			if (max > min)
				continue;
			else
				min = max;
			System.out.println("Smallest number is");
		}
	}
}
