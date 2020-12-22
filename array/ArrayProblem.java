package com.yao.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class ArrayProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {3,2,4};
//		System.out.println(Arrays.toString(twoSum2(arr, 6)));
		
//		int[] arr2= {-3,-2,-1};
//		System.out.println(maxSubArray2(arr2));
		
//		int[] arr3= {5};
		//System.out.println(plusOne(arr3));
//		System.out.println(Arrays.toString(plusOne2(arr3)));
		
//		int[] arr4 = {3,2,3};
//		System.out.println(majorityElement(arr4));
		
		int[] arr5 = {1,2,3,1};
		System.out.println(containsDuplicate(arr5));

	}
	
    public static int[] twoSum(int[] nums, int target) {
        int[] newArr=new int[2]; 
        for(int i=0; i<nums.length;i++){
            for(int k=i+1; k<nums.length;k++){
                if(nums[i]+nums[k]==target){
                     newArr[0] = i;
                     newArr[1]=k;
                    break;
                }
            }
        }
        return newArr;
    }
    
    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
    
    
//    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//    		Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
//
//    		 
//
//    		Example 1:
//
//    		Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//    		Output: 6
//    		Explanation: [4,-1,2,1] has the largest sum = 6.
    
    public static int maxSubArray(int[] nums) {
    	Integer sum = null;
    	Integer max= null;
    	if(nums.length==1) {
    		return nums[0];
    	}
    	max=nums[0];
    	for(int i=0; i<nums.length;i++) {
    		    sum=nums[i];
    			if(sum>max) {
    				max=nums[i];
    			}
    		for(int k=i+1;k<nums.length;k++) {
    			sum+=nums[k];
    			if(sum>max) {
    				max=sum;
    			}
    		}
    		sum=0;
    	}
        return max;
    }
    
    //The catch here is that we have to take care of negative value.
    public static int maxSubArray2(int[] A) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum < 0) 
                sum = A[i];
            else 
                sum += A[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
    
    
//    Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
//
//    The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
//
//    You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//     
//
//    Example 1:
//
//    Input: digits = [1,2,3]
//    Output: [1,2,4]
//    Explanation: The array represents the integer 123.
    
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                System.out.println("digits["+i+"]="+digits[i]);
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        
        return newNumber;
    }
    
    public static int[] plusOne2(int[] digits) {
    	if (digits == null || digits.length == 0)
    		return null;
    	int n = digits.length, carry = 1;
    	for (int i = n - 1; i >= 0; i--) {
    		int sum = digits[i] + carry;
    		digits[i] = sum % 10;
    		System.out.println(digits[i]);
    		carry = sum / 10;
    		if (carry == 0)
    			return digits;
    	}
    	int[] a = new int[n + 1];
    	System.arraycopy(digits, 0, a, 1, n);
    	a[0] = carry;
    	return a;
    }
    	
    public static List<List<Integer>> generate(int numRows) {
		List<List <Integer>> triangel = new ArrayList<List<Integer>>();
		if(numRows==0) {
			return triangel;
		}
		
		for(int i=0; i<numRows;i++) {
			List<Integer> row = new ArrayList<Integer>();
			for(int j=0;j<i+1;j++) {
				if(j==0||j==i) {
					row.add(1);
				}else {
					row.add(triangel.get(i-1).get(j-1)+triangel.get(i-1).get(j));
				}
			}
			triangel.add(row);
		}
		return triangel;
	}
    
    
//    Say you have an array for which the ith element is the price of a given stock on day i.
//
//    If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//    Note that you cannot sell a stock before you buy one.
	public static int maxProfit11(int[] prices) {
		int maxProfit = 0;
		  for(int i=0; i<prices.length-1;i++) {
			  for(int k=i+1; k<prices.length;k++) {
				  if(prices[i]<prices[k]) {
					  int temp = prices[k]-prices[i];
					  if(temp>maxProfit) {
						  maxProfit=temp;
					  }
				  }
			  }
		  }
		  return maxProfit;
	}
	
	public static int maxProfit12(int[] prices) {
		int min = Integer.MAX_VALUE;
		int max =0;
		for(int i=0; i<prices.length;i++) {
			min = Math.min(min, prices[i]);
			max = Math.max(max, prices[i]-min);
		}
		return max;
	}
	
	
//	Say you have an array prices for which the ith element is the price of a given stock on day i.
//
//	Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
//
//	Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
//
//	Example 1:
//
//	Input: [7,1,5,3,6,4]
//	Output: 7
//	Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//	             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
	
	
	
	
	
	
	
//	Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//	You may assume that the array is non-empty and the majority element always exist in the array.
//
//	Example 1:
//
//	Input: [3,2,3]
//	Output: 3
    public static int majorityElement(int[] nums) {
    	int max =0;
    	int theRealNum=0;
        Map<Integer, Integer> majorElement = new HashMap<Integer,Integer>();
        for(int item:nums) {
        	if(majorElement.containsKey(item)) {
        		majorElement.put(item,  majorElement.get(item)+1);
        	}else {
        		majorElement.put(item, 1);
        	}
        }
       for(int maxNum: majorElement.keySet()) {
    	   if(majorElement.get(maxNum)>max) {
    		   System.out.println(majorElement.get(maxNum));
    		   System.out.println(maxNum);
    		   System.out.println();
    		   max=majorElement.get(maxNum);
    		   System.out.println();
    		   theRealNum=maxNum;
    		   System.out.println("the real num "+ theRealNum);
    	   }
       }
        return theRealNum;
    }
    
//    Given an array of integers, find if the array contains any duplicates.
//
//    Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//    		Example 1:
//
//    			Input: [1,2,3,1]
//    			Output: true
    
		 public  static boolean containsDuplicate(int[] nums) {
			 Set<Integer> numSet = new HashSet<Integer>();
		        for(int item: nums) {
		        	numSet.add(item);
		        }
		       return  numSet.size()==nums.length?true:false;
		    }
	
	
}
