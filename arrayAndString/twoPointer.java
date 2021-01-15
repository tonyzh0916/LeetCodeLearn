package com.yao.arrayAndString;
import java.util.Arrays;

public class TwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0};
		System.out.println(Arrays.toString(twoSum(nums,-1)));
	}
	
    public static int arrayPairSum(int[] nums) {
       Arrays.sort(nums);
       int ans=0;
       for(int i=0; i<nums.length;i+=2) {
    	   ans +=nums[i];
       }
        return ans;
    }
	
    public static int[] twoSum(int[] numbers, int target) {
    	int[] ans = new int[2];
        for(int i=0; i<numbers.length-1;i++) {
        	for(int j=i+1; j<numbers.length;j++) {
        		if(numbers[i]+numbers[j]==target) {
        			ans[0]=i+1;
        			ans[1]=j+1;
        			return ans;
        		}
        	}
        }
        return ans;
    }
    
    public int[] twoSum2(int[] numbers, int target) {
        int a=0;
        int b=numbers.length-1;
        while(a<=b){
            int sum = numbers[a]+numbers[b];
            if(sum>target){
                b--;
            }else if(sum<target){
                a++;
            }else{
                return new int[] {a+1,b+1};
            }
        }
        return new int[] {a+1,b+1};
    }
    
    public static int minSubArrayLen(int s, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int  left =0;
        for(int i=0; i<nums.length;i++) {
        	     		sum +=nums[i];
        	while(sum>=s) {
        		result=Math.min(result, i+1-left);
        		sum-=nums[left];
        		left++;
        	}
        }
        return (result!=Integer.MAX_VALUE)?result:0;
    }
	

}