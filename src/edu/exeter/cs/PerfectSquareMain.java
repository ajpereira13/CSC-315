package edu.exeter.cs;

public class PerfectSquareMain {

	public static void main(String[] args) {
		
		System.out.println(perfectSquare(64));

	}
	
	public static boolean perfectSquare(int n) {
		if (n == 1) {
			return true;
		} else {
			for (int i = 1; i <= (int) (n / 2); i++) {
				if (n == i * i) {
					return true;
				}
			}
			return false;
		}
	}

}
















