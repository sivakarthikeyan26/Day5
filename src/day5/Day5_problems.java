package day5;

import java.util.Scanner;

public class Day5_problems {

	public static void main(String[] args) {
		int count =0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			count=0;
			if (n%i==0) {
				for (int j=1; j<=i; j++) {
					if(i%j==0) {
						count += 1;
					}
				}
			}
			if (count==2 || count==1) {
				System.out.println(+i);
			}
		}
	}

}
