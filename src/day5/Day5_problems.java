package day5;

import java.util.Scanner;

public class Day5_problems {

	public static void main(String[] args) {
		float ans=0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			ans += (float)1/i;
		}
		System.out.println(+ans);
	}

}
