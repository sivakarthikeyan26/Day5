package day5;

import java.util.Scanner;

public class Day5_problems {

	public static void main(String[] args) {
		System.out.println("enter the character");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U') {
			System.out.println(a+" is vowel");
		}
		else {
			System.out.println(a+" is consonant");
		}
	}
		
	}

