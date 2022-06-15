import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Design a class which receives a list of words in the constructor, and implements a method that takes 
 * two words word1 and word2 and return the shortest distance between these two words in the list. 
 * Your method will be called repeatedly many times with different parameters.

Example: Assume that words = [“practice”, “makes”, “perfect”, “coding”, “makes”].
Input: word1 = “coding”, word2 = “practice”
Output: 3
Input: word1 = "makes", word2 = "coding"
Output: 1
Note: You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.

 */

 class WordDistance{
  HashMap<String, List<Integer>> map;
  public  WordDistance(String[] words){
    this.map = new HashMap<>();
    for(int i=0; i<words.length;i++){
      if(!map.containsKey(words[i])){
        map.put(words[i], new ArrayList<>());
      }
      map.get(words[i]).add(i);
    }
  }

  public int shortest(String word1, String word2){
    List<Integer> l1 = map.get(word1);
    List<Integer> l2 = map.get(word2);

    int p1=0;
    int p2=0;

    int min = Integer.MAX_VALUE;
    while(p1<l1.size() && p2<l2.size()){
      min = Math.min(min, Math.abs(l1.get(p1)-l2.get(p2)));
        if(l1.get(p1)<l2.get(p2)){
          p1++;
        }else{
          p2++;
        }
      
    }
    return min;
  }
 }