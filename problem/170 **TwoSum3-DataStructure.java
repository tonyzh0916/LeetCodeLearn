import java.util.HashMap;
import java.util.Map;

/*
Desgin and implement a TwoSum class, it should suupport the following operations: add fand find 
add - addd the number to an internal data structure 
find - Find if there exists any pair of number which sum is equal to the value 
*/

class TwoSum{
  private HashMap<Integer, Integer> map;
  //Initialize your ddata structure here 

  public TwoSum(){
    map = new HashMap<>();
  }

  // aadd the number to an interanl data structure
  public void add(int number){
    if(map.containsKey(number)){
      map.put(number, map.get(number)+1);
    }else{
      map.put(number, 1);
    }
  }

  //Find if there exists any pair of number which sum is equal to the value
  public boolean find(int value){
    for(Map.Entry<Integer, Integer> entry : map.entrySet()){
      int num1 = entry.getKey();
      int comp = value-num1;
      if((num1 == comp)&& entry.getValue()>1 || (num1!=comp)&& map.containsKey(comp)){
        return true;
      }
    }
    return false;
  }
}
