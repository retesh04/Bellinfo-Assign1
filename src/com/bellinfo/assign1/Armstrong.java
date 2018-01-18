package com.bellinfo.assign1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int number = new Scanner(System.in).nextInt();
		if(Armstrong(number)) {
			System.out.println("Number : "+ number + " is armstrong");
		}else {
			System.out.println("Number : "+ number + " is not an armstrong");
			}
	}

	private static boolean Armstrong(int number) {
	int result=0, remainder, original;
	while(number !=0) {
	original = number;
	remainder = number%10;
	result = result + remainder*remainder*remainder;
	number = number/10;
	}
	if(number == 0) {
		return true;
	}
		return false;
	}
}
