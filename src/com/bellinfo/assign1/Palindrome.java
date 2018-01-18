package com.bellinfo.assign1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int number = new Scanner(System.in).nextInt();
		if(Palindrome(number)) {
			System.out.println("Number : "+ number + " is Palindrome");
		}else {
			System.out.println("Number : "+ number + " is not an Palindrome");
			}
	}

	private static boolean Palindrome(int number) {
		int palindrome = number, reverse = 0;
		while(palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome/10;
		}
		if(number == reverse) {
			return true;
		}
		return false;
	}

}
