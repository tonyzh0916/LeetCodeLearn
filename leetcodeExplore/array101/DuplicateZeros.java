/*
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input 
array in place and do not return anything.

Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
 
Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 9
*/
public void duplicateZeros(int[] arr){
  List<Integer> list = new ArrayList<Integer>();
  for(int num : arr){
    if(num ==0){
      list.add(0);
    }
    list.add(num);
  }
  for(int i=0; i<arr.length;i++){
    arr[i]=list.get(i);
  }
}

public void duplicateZeros(int[] arr){
  int n = arr.length, index=0;
  int[] copy = arr.clone();

  for(int num : copy){
    if(index >n){
      break;
    }
    if(index+1<n && num==0){
      arr[index++]=0;
      arr[index++]=0;
    }else{
      arr[index++]=num;
    }
  }
}

public void duplicateZeros3(int[] arr){
  int count =0;
  for(int num : arr){
    if(num==0){
      count++;
    }
  }

  int n=arr.length, n2=n+count;
  //i 是原数组的索引， j是原数组的长度加count
   for(int i=n-1, j=n2-1; i<j;i--,j--){
     if(arr[i]!=0){
       if(j<n){
         arr[j]=arr[i];
       }
     }else{
       if(j<n){
         arr[j]=arr[i];
       }
       j--;
       if(j<n){
         arr[j]  = arr[i];
       }
     }
   }
}

//////////////////08/25/2021////
int  n= arr.length, index=0;
int[] copy= arr.clone();
for (int num : copy){
  if(index>=n){
    break;
  }
  if(index+1<n && num==0){
    arr[index++]=0;
    arr[index++]=0;
  }else{
    arr[index++]= num;
  }
}