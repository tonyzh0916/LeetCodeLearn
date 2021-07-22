/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
The replacement must be in place and use only constant extra memory.

Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:
Input: nums = [1,1,5]
Output: [1,5,1]
Example 4:
Input: nums = [1]
Output: [1]
*/

public List<Integer> findCloseElement(int[] arr, int k, int x){
  int n = arr.length;
  if(x<=arr[0]){
    return Arrays.stream(Arrays.copyOfRange(arr, 0, k)).boxed().collect(Collectors.toList());
  }
  if(arr[n-1]<=x){
    return Arrays.stream(Arrays.copyOfRange(arr, n-k, n)).boxed().collect(Collectors.toList());
  }
  int index = Array.binarySearch(arr, x);
  if(index<0){
    index = -(index+1);
  }
  int low = Math.max(0, index-k-1); high = Math.min(n-1, index+1);

  while(high - low > k-1){
    if(low<0||(x-arr[low])<=(arr[high]-x)){
      high--;
    }else if (high>n-1 || (x-arr[low])>(arr[high]-x)){
      low++;
    }else{
      System.out.println("Error");
    }
  }

  List<Integer> l = new ArrayList<>();
  int[] newArr = Arrays.copyOfRange(arr,  low, high+1);
  for(int i=0; i<newArr.length;i++){
    l.add(newArr[i]);
  }

  return   return Arrays.stream(Arrays.copyOfRange(arr, low, high+1)).boxed().collect(Collectors.toList());
}

public static int binarySearch0(long[] a, int fromIndex, int toIndex, long key){
  int low = fromIndex;
  int high = toIndex-1;

  while(low<=high){
    int mid = low+(high-low)/2;
    long midVal = a[mid];
    if(midVal<key)
      low = mid+!;
    else if(midVal>key)
      high = mid-1;
    else
      return mid;
  }
  return -(low+1);
}

