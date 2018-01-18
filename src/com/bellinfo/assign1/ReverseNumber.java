package com.bellinfo.assign1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int reverse = 0;

		System.out.println("Enter the number to reverse");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}

		System.out.println("Reverse of entered number is " + reverse);
	}
}
