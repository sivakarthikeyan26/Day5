package day5;

import java.util.Scanner;

public class Day5_problems {

	public static void main(String[] args) {
		int temp;
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("the value of a is :"+a+" and b is :"+b);
	}

}
