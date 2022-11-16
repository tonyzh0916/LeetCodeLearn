import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int left =0, maxLen=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                left = Math.max(left, map.get(c));
            }

            if(i-left+1>maxLen){
                maxLen = i-left+1;
            }
            map.put(c, i);
        }
        return maxLen;
    }
}
