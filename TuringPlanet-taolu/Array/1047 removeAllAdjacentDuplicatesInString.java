class Solution {
    public String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int i =0;
       
        for(int j=0; j<s.length(); j++){
             char current = s.charAt(j);
            if(i>0 && stack[i-1]==current){
                i--;
            }else{
                stack[i]=current;
                i++;
            }
        }
        return new String(stack, 0, i);
    }
}