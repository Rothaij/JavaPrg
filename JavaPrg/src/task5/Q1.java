package task5;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String original = scanner.nextLine();

		boolean isPalindrome = true;
		
		int length = original.length();

		for (int i = 0; i < length / 2; i++) {
			
			if (original.charAt(i) != original.charAt(length - 1 - i)) {
				
				isPalindrome = false;
				
				break;
			}
		}

		if (isPalindrome) {

			System.out.println("The string is a palindrome.");

		} else {

			System.out.println("The string is not a palindrome.");
		}
	}
}