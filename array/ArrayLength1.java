package com.yao.array;


public class ArrayLenth1 {

	public static void main(String[] args) {
		int[] nums = {1,0,1,1,0,1};
		
		int maxCount=findMaxConsecutiveOnes1(nums);
		System.out.println(maxCount);
    
	}
	
//	Given a binary array, find the maximum number of consecutive 1s in this array.
//
//	Example 1:
//	Input: [1,1,0,1,1,1]
//	Output: 3
//	Explanation: The first two digits or the last three digits are consecutive 1s.
//	    The maximum number of consecutive 1s is 3.
//	Note:
//
//	The input array will only contain 0 and 1.
//	The length of input array is a positive integer and will not exceed 10,000
	
    public static int findMaxConsecutiveOnes1(int[] nums) {
        int count = 0;
        int temp = 0;
        for(int i=0; i<nums.length;i++) {
        	if(nums[i]==1) {
        		temp++;
        	}else {
        		count=0;
        		if(temp>count) {
        			count = temp;
        			temp=0;
        		}else {
        			temp=0;
        		}
        	}
        }
	
        return count;
    }
}
