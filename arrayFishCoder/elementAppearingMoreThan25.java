class Solution {
  public int findSpecialInteger(int[] arr) {
      double value = arr.length*0.25;
      Map<Integer, Integer> store = new HashMap<Integer, Integer>();
      for(int i=0; i<arr.length;i++){
          if(store.containsKey(arr[i])){
              store.put(arr[i],store.get(arr[i])+1);
              if(store.get(arr[i])>value){
                  return arr[i];
              }
          }else{
              store.put(arr[i],1);
              if(store.get(arr[i])>value){
                  return arr[i];
              }
          }
      }    
      return -1;
  }
}

class Solution {
  public int findSpecialInteger(int[] arr) {
      int value = arr.length/4;
      for(int i=0; i<arr.length;i++){
          if(arr[i]==arr[i+value]){
              return arr[i];
          }
      }    
      return -1;
  }
}