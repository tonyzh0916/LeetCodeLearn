package com.yao.array;

import java.util.Arrays;

public class ArrayDelete1 {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int val = 2;
		System.out.println(removeDuplicates(nums));

	}
	
	
	/*
	 * 
	 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
	   Output: 5, nums = [0,1,4,0,3]

	 */
	
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
	
	
//	Input: nums = [0,0,1,1,1,2,2,3,3,4]
//	Output: 5, nums = [0,1,2,3,4]
	
    public static int removeDuplicates(int[] nums) {
    	int k=0;
        for(int i=0; i<nums.length;i++) {
        	if(nums[k]!=nums[i]) {
        		k++;
        		nums[k]=nums[i];
        		
        	}else {
        		continue;
        	}
        }
        System.out.println(Arrays.toString(nums));
        return k+1;
    }

}

// two pointer one is fast one is slow 