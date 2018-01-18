package com.bellinfo.assign1;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		int number = scan.nextInt();
		for (int i = 2; i <= number/2; i++) {
			if (number % i == 0) {
				System.out.println("number is not prime");
			}
		}
	}
}
