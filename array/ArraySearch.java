package com.yao.array;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0,1,3};
		//System.out.println(checkIfExist(arr));
		
		int[] arr2 = {0,3,2,1};
		System.out.println(validMountainArray(arr2));

	}
	
    public static boolean checkIfExist(int[] arr) {
    	boolean result = false;
    	for(int i=0; i<arr.length;i++) {
    		for(int k=0; k<arr.length;k++) {
    			if(arr[k]*2==arr[i] && k!=i) {
    				System.out.println("arr[k]*2= "+arr[k]*2);
    				System.out.println("arr[i]= "+arr[i]);
    				System.out.println();
    				result=true;
    				break;
    			}
    		}
    	}
    	return result;
    }
    
    
 public static boolean validMountainArray(int[] arr) {
	 System.out.println(Arrays.toString(arr));
        int max =arr[0];
        int maxIndex =0;
        boolean leftSide=true;
        boolean rightSide=true;
        for(int i=0; i<arr.length-1;i++) {
        	if(max<arr[i+1]) {
        		
        		max=arr[i+1];
        		maxIndex=i+1;
        	}
        }
        System.out.println("the max "+max +" the max index "+maxIndex);
 
       if(maxIndex==0 || maxIndex==arr.length-1) {
    	   return false;
       }
       
       //left side
       for(int m=0; m<maxIndex; m++) {
    	   if(arr[m]>=arr[m+1]) {
    		   leftSide= false;
    		   break;
    	   }
       }
       
       //right side
       for(int n=maxIndex; n<arr.length-1; n++) {
    	   if(arr[n]<=arr[n+1]) {
    		   System.out.println("arr["+n+"]="+arr[n]+"  arr["+(n+1)+"]="+arr[n+1]);
    		   rightSide= false;
    		   break;
    	   }
       }
       
       System.out.println("the leftSide "+leftSide+"      the rightSide "+ rightSide );
       
       
       return leftSide&&rightSide?true:false;
 	}
}
