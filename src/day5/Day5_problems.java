package day5;

import java.util.Scanner;

public class Day5_problems {

	public static void main(String[] args) {
		float quotient=0;
		int remainder=0;
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		quotient=(float)a/b;
		remainder=a%b;
		System.out.println("The quotient is :"+quotient+" and the remainder is:"+remainder);
		
	}

}
