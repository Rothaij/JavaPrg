package task5;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (j == i || j == n - i - 1)

					System.out.print("*");

				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}