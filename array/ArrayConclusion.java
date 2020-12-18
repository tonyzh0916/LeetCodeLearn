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
	
	 public static int heightChecker(int[] heights) {//?
	        int result =0;
	        for(int i=0;i<heights.length-1;i++){
	            for(int k=0; k<heights.length-1-i;k++){
	                if(heights[k]>heights[k+1]){
	                    int temp=0;
	                    temp=heights[k+1];
	                    heights[k+1]=heights[k];
	                    heights[k]=temp;
	                    
	                }
	            }
	        }
	        System.out.println(Arrays.toString(heights));
	        return result;
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
