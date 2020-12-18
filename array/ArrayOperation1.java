package com.yao.array;

import java.util.Arrays;

public class ArrayOperations1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {17,18,5,4,6,1};
		System.out.println(Arrays.toString(replaceElements(arr)));
	}
	
	public static int[] replaceElements(int[] arr) {
		if(arr.length<2) {
			return arr;
		}else {
			
			for(int i=0;i<arr.length-1;i++) {
				int maxValue=arr[i+1];
				System.out.println("maxValue "+ maxValue);
				for(int k=i+1;k<arr.length;k++) {
					System.out.println("arr[k] "+arr[k]);
					if(arr[k]>maxValue) {
						maxValue=arr[k];
					}
				}
				arr[i]=maxValue;
				System.out.println("after if maxValue "+ maxValue);
			}
			arr[arr.length-1]=-1;
		}
		return arr;
	}

}
