package edu.exeter.cs;

public class Sum28Main {
	
	public static void main(String[] args) {
		int[] arrayOfNums = {2,2,3,4,2,2};  
		System.out.println(sum28(arrayOfNums));
	}
	
	public static boolean sum28(int[] nums) {
		int count = 0;
		for (int x = 0; x< nums.length; x++) {
			if (nums[x] == 2) {
				count++;
		    }
		}
		if (count == 4) {
			return true;
		} else {
		    return false;
		}
	}
}
