package edu.exeter.cs;

public class MatchUpMain {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3};
		int[] array2 = {1,1,1};
		System.out.println(matchUp(array1,array2));

	}
	
	public static int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			int max = Math.max(nums1[i],nums2[i]);
			int min = Math.min(nums1[i],nums2[i]);
			if (max - min <= 2 && max - min != 0) {
				count++;
			}
		}
		return count;
	}

}
