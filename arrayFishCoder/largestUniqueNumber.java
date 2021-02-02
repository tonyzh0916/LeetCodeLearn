class Solution{
  public int largestUniqueNumber(int[] A){
    Map<Integer, Integer> map = new HashMap();

    for(int item :A){
      map.put(item ,  map.getOrDefault(num, 0)+1);
    }

    int max = 1;
    for(int key : map.keySet()){
      if(map.get(key)==1){
        max = Math.max(max, key);
      }
    }
    return max;
  }
}

class Solution{
  public int largestUniqueNumber(int[] A){
    TreeMap<Integer, Integer> map = new TreeMap<>((a,b)->b-a);

    for(int item :A){
      map.put(item ,  map.getOrDefault(num, 0)+1);
    }

    for(int key : map.keySet()){
      if(map.get(key)==1){
        return key;
      }
    }
    return -1;
  }
}

class Solution{
  public int largestUniqueNumber(int[] A){
    int[] counts = new int[1001];
    for(int num : A){
      counts[num]++;
    }
    for(int i=1000;i>=0;i--){
      if(counts[i]==1){
        return i;
      }
    }
    return -1;
  }
}