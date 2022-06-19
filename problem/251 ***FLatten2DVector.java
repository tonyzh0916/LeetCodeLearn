/*
 * Design and implement an iterator to flatten a 2d vector. It should support the following operations: next and hasNext.

Example:

Vector2D iterator = new Vector2D([[1,2],[3],[4]]);

iterator.next(); // return 1
iterator.next(); // return 2
iterator.next(); // return 3
iterator.hasNext(); // return true
iterator.hasNext(); // return true
iterator.next(); // return 4
iterator.hasNext(); // return false
Notes:

Please remember to RESET your class variables declared in Vector2D, as static/class variables are persisted across multiple 
test cases. Please see here for more details.
You may assume that next() call will always be valid, that is, there will be at least a next element in the 2d vector when next() 
 */

 class Vector2D{
  int index1 = 0;
  int index2 =0;
  int[][] nums;

  public Vector2D(int[][] v){
    nums = v;
  }

  public int next(){
    hashNext();
    return nums[index1][index2++];
  }

  public boolean hashNext(){
    while(index1 < nums.length){
      if(index2<nums[index1].length){
        return true;
      }
      index1++;
      index2=0;
    }
    return false;
  }
 }