package com.yao.array;

import java.util.Arrays;

public class ArrayOperation2 {

	public static void main(String[] args) {
		//moveZeroes
//		int[] arr = {0,1,0,3,12};
//		moveZeroes(arr);
		
		
		//sortArrayByParity
//		int[] arr= {3,1,2,4};
//		sortArrayByParity(arr);
		
		
		int[] arr= {3,1,2,4};
		bubbleSort(arr);
	}
	
		
//	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//	Example:
//
//	Input: [0,1,0,3,12]
//	Output: [1,3,12,0,0]
//	Note:
//
//	You must do this in-place without making a copy of the array.
//	Minimize the total number of operations.

	  public static void moveZeroes(int[] nums) {
		  
		  int writePointer=0;
		  
		  for(int i=0; i<nums.length;i++) {
			  if(nums[i]!=0) {
				  nums[writePointer++]=nums[i];
			  } 
			  if(i>=writePointer) {
				  nums[i]=0;
			  }
		  }

		  System.out.println(writePointer);
		  System.out.println(Arrays.toString(nums));
	        
	  }
	  
//	  Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
//
//			  You may return any answer array that satisfies this condition.
//
//			   
//
//			  Example 1:
//
//			  Input: [3,1,2,4]
//			  Output: [2,4,3,1]
//			  The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	  
	  public static int[] sortArrayByParity(int[] A) {
		  	if(A.length==1) {
		  		return A;
		  	}
	        int[] oddArr = new int[A.length];
	        int writePointer =0;
	        int indexOddArr=0;
	        for(int i=0;i<A.length;i++) {
	        	if(A[i]%2==0) {
	        		A[writePointer++]=A[i];
	        	}else {
	        		oddArr[indexOddArr++]=A[i];
	        	} 	
	        }
	        
	        if(writePointer<A.length) {
	        	for(int k=0;k<indexOddArr;k++) {
	        		A[writePointer++]=oddArr[k];
	        		System.out.println(writePointer);
	        	}
	        }
	        System.out.println("indexOddArr=> "+indexOddArr);
	        System.out.println("A =>"+Arrays.toString(A));
	        System.out.println("oddArr=> "+Arrays.toString(oddArr));
	        return A;
	    }
	  
	  static void bubbleSort(int arr[]) { 
	        int n = arr.length; 
	        System.out.println(Arrays.toString(arr));  
	        for (int i = 0; i < n-1; i++) {
	        	for (int j = 0; j < n-i-1; j++) {
	        		    if (arr[j] > arr[j+1]) 
	                { 
	                    // swap arr[j+1] and arr[j] 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                } 
	        		           System.out.println(Arrays.toString(arr));   
	        	}
	       
	        }

	   
	    } 
}
