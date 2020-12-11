package com.yao.array;

import java.util.Arrays;

public class ArrayDelete1 {

	public static void main(String[] args) {
		int[] nums = {0,2,2,0};
		int val = 0;
		System.out.println(removeElement(nums, val));

	}
	
	public static int removeElement(int[] nums, int val) {
	    int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    System.out.println(Arrays.toString(nums));
	    return i;
	}

}
