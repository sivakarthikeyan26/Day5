package day5;

import java.util.Scanner;

public class Day5_problems {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println(+Math.pow(2, i));
		}
	}

}
