package edu.exeter.cs;

public class Less20Main {

	public static void main(String[] args) {
		
		System.out.println(less20(38));

	}
	
	public static boolean less20(int num) {
		if (num%20 == 19 || num%20 == 18) {
			return true;
		} else {
			return false;
		}
	}

}
