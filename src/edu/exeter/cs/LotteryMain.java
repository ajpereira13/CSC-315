package edu.exeter.cs;

public class LotteryMain {

	public static void main(String[] args) {
		
		System.out.println(lottery(1,2,3));
		
	}
	
	public static int lottery(int a, int b, int c) {
		if (a == b && b == c) {
			return 20;
		} if ( a == b && b!=c || a == c && c != b || b == c && b != a) {
			return 10;
		} else {
			return 0;
		}
	}

}
