package day5;

import java.util.Scanner;

public class Day5_problems {

	public static void main(String[] args) {
		System.out.println("enter the numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	}
}
