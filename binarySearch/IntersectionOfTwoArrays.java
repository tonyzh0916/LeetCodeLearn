/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the 
result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/

//hashMap solution
public int[] intersection(int[] nums1, int[] nums2){
  //use two hash sets, Time complexity:O(n) runtime O(m+n)
  if(nums1.length>nums2.length){
    return intersection(nums2, nums1);
  }
  //nums1.lenth <= nums2.length
  Set<Integer> set = new HashSet<>(nums1.length);
  Set<Integer> intersect = new HashSet<>(nums1.length);
  for(int i :nums1){
    set.add(i);
  }
  for(int i:nums2){
    if(set.contains(i)){
      intersect.add(i);
    }
  }

  return intersect.stream().mapToInt(Number::intValue).toArray();
}

//Two Pointers
public int[] intersection2(int[] nums1, int[] nums2){
  //sort both arrays use two pointers time complexity :O(nlogn)
  //if already sorted num1.length is m num2.length is n, runtime O(m+n)
  Set<Integer> set = new HashSet<>();
  Arrays.sort(nums1);
  Arrays.sort(nums2);
  int i=0;
  int j=0;
  while(i<nums1.length && j<nums2.length){
    if(nums1[i]<nums2[j]){
      i++;
    }else if(nums1[i]>nums2[j]){
      j++;
    }else{
      set.add(nums1[i]);
      i++;
      j++;
    }
  }
  return set.stream().mapToInt(Number::intValue).toArray();
}


//Binary Search
public int[] intersection3(int[] nums1, int[] nums2){
  //Binary search Time complexity O(nlogn)
  if(nums1.length>nums2.length){
    return intersection3(nums2, nums1)
  }
  //nums1.length <= nums2.length
  Set<Interger> set = new HashSet<>();
  Arrays.sort(nums1);
  Arrays.sort(nums2);
  int l=0; r=nums2.length;
  for(Intefer num :nums1){
    int index = Arrays.binarySearch(nums2,l,r,num);
    if(index>=0){
      set.add(num);
      l=index+1; 
    }else{
      index = -(index+1);
      if(index>=r){
        break
      }
      l=index;
    }
  }
  return set.stream().mapToInt(Number::intValue).toArray();
}

private static int binarySearch(int[] a, int fromIndex, int toIndex, int key){
  int low = fromIndex;
  int hight = toIndex-1;
  while(low<=high){
    int mid = (low+high)>>>1;
    int midVal=a[mid];

    if(midVal<key)
      low=mid+1;
    else if (midVal>key)
      high = mid-1;
    else
      return mid;
  }
  return -(low+1);
}