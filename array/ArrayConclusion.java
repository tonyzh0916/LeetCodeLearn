package com.yao.array;

import java.util.Arrays;

public class ArrayConclusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr= {1,1,4,2,1,3};
//		heightChecker(arr);
		
		int[] arr= {1,1,2};
		thirdMax(arr);
	}

// 	Students are asked to stand in non-decreasing order of heights for an annual photo.

// Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

// Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.

 

// Example 1:

// Input: heights = [1,1,4,2,1,3]
// Output: 3
// Explanation: 
// Current array : [1,1,4,2,1,3]
// Target array  : [1,1,1,2,3,4]
// On index 2 (0-based) we have 4 vs 1 so we have to move this student.
// On index 4 (0-based) we have 1 vs 3 so we have to move this student.
// On index 5 (0-based) we have 3 vs 4 so we have to move this student.
	

	// The problem asks us to figure out how many students are out of place in terms of ranking them from 
	// shortest to tallest. I create a clone of the input array and sort it. By sorting the cloned array, 
	// we can see what our array should look like if each student were to be correctly ordered by height. 
	// After this point the problem becomes very simple because we just need to iterate from i = 0 to n-1 and 
	// compare the value at i in each array to see if they are the same. If they are not the same, then that means 
	// that a student in the input array is not in their correct spot, therefore count is incremented by 1. 
	// The time complexity is O(nlogn) because it is bounded by the Java sort method, which runs in O(nlogn) time.
	public int heightChecker(int[] heights) {
		int[] copy = heights.clone();
		Arrays.sort(copy);
		int count = 0;
		for(int i = 0; i < copy.length; i++){
				if(heights[i]!=copy[i])count++;
		}
		return count;
}
	 
	 
//	 
//	 Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
//
//			 Example 1:
//			 Input: [3, 2, 1]
//
//			 Output: 1
//
//			 Explanation: The third maximum is 1.
//	 
	    public static int thirdMax(int[] nums) {
	    	Integer maxOne=null;
	    	Integer maxTwo=null;
	    	Integer maxthree=null;
	    	
	        if(nums.length==1) {
	        	maxthree= nums[0];
	        } else if(nums.length==2) {
	        	System.out.println("Ha");
	        	if(nums[0]>nums[1]) {

	        		maxthree= nums[0];
	        		System.out.println("1 "+maxthree);
	        	}else {
	        		maxthree= nums[1];
	        		System.out.println("2= "+maxthree);
	        	}
	        }else {
	        	for(int item : nums) {
	        		if((maxOne==null || item!=maxOne ) && (maxTwo==null|| item!=maxTwo) && (maxthree==null|| item!=maxthree)) {
			        	if(maxOne==null || item>maxOne) {
			        		maxthree=maxTwo;
			        		maxTwo=maxOne;
			        		maxOne=item;
			        		System.out.println("go in One "+"maxOne==>"+maxOne+"  maxTwo=>"+maxTwo+"  maxThree=>"+maxthree);
			        	}else if(maxTwo == null || item>maxTwo) {
			        		maxthree = maxTwo;
			        		maxTwo=item;
			        		System.out.println("go in two "+"maxOne==>"+maxOne+"  maxTwo=>"+maxTwo+"  maxThree=>"+maxthree);
			        	}else if(maxthree==null || item>=maxthree) {
			        		maxthree=item;
			        		System.out.println("go in three "+"maxOne==>"+maxOne+"  maxTwo=>"+maxTwo+"  maxThree=>"+maxthree);
			        	}
	        		}else {
	        			continue;
	        		}
	        	}
	        } 
			System.out.println("maxOne==>"+maxOne+"  maxTwo=>"+maxTwo+"  maxThree=>"+maxthree);
			if(maxthree==null) {
				return maxOne;
			}
	        return maxthree;
	        
	    }

}
