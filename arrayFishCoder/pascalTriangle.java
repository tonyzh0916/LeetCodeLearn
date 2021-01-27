class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<List<Integer>>();

    if(numRows<=0) return triangle;

    for(int i=0; i<numRows;i++){
      List<Integer> newRow = ArrayList<Integer>();
      for(int j=0; j<i+1;j++){
        if(j==0 || j==i){
          newRow.add(1);
        }else{
          newRow.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j-1));
        }
      }
      triangle.add(newRow);
    }
    return triangle;
  }
}