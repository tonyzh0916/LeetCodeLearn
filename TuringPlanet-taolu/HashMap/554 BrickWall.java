class Solution {
  public int leastBricks(List<List<Integer>> wall) {
      HashMap<Integer, Integer> map = new HashMap<>();
      
      for(List<Integer> row : wall){
          int sum = 0;
          for(int i=0; i<row.size()-1; i++){
              sum +=row.get(i);
              map.put(sum, map.getOrDefault(sum, 0)+1);
          }
      }
      
      int res = wall.size();
      for(int edge : map.values()){
          res = Math.min(res,wall.size()-edge);
      }
      return res;
  }
}