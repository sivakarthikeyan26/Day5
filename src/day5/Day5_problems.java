package day5;

import java.util.Scanner;

public class Day5_problems {

	public static void main(String[] args) {
		int TailCounter=0;
		int HeadCounter=0;
		System.out.println("Enter no of times to flip the coin");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1 ; i<=n ; i++) {
			float a = (float) (Math.random());
			double coin = (double) Math.round(a * 10) / 10;
			if(coin<0.5) {
				TailCounter +=1;
			}
			else {
				HeadCounter +=1;
			}
		}
		float tail_percent= (float)TailCounter/n *100;
		float head_percent= (float) (100-tail_percent);
		System.out.println("tail percentage is :"+tail_percent+" and head percentage is :"+head_percent);
	}

}
