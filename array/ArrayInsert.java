package com.yao.array;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * 
	 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

		Note that elements beyond the length of the original array are not written.

		Do the above modifications to the input array in place, do not return anything from your function.
			
		Input: [1,0,2,3,0,4,5,0]
		Output: null
		Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]	
	 */

    public static void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length_ = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= length_ - possibleDups; left++) {
        	System.out.println("left=>"+left);
        	
            // Count the zeros
            if (arr[left] == 0) {
           
                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included  
                if (left == length_ - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
                System.out.println("possibleDups=>"+possibleDups);
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = length_ - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
    
    
    /*
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

		Note:

		The number of elements initialized in nums1 and nums2 are m and n respectively.
		You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
		Example:
		
		Input:
		nums1 = [1,2,3,0,0,0], m = 3
		nums2 = [2,5,6],       n = 3
		
		Output: [1,2,2,3,5,6]

     */
    
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int startNum = m;
        for(int i=0 ; i<nums2.length;i++ ){
            nums1[startNum+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
    
    public void merge2(int A[], int m, int B[], int n) {
        int i = m-1;
        int j = n-1;
        for (int k = m+n-1; k >= 0; k--) {
            if (i < 0) {
            	A[k] = B[j--];
            }else if (j < 0) {
            	A[k] = A[i--];
            }else if (A[i] < B[j]) {
            	A[k] = B[j--];
            } else {
            	A[k] = A[i--];
            }
        }
    }
    
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? 
                                 nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }
    }
}
