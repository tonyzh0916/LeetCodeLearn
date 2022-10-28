class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(res, -1);
        for(int i=0; i<2*len; i++){
            int num = nums[i%len];
            while(!stack.isEmpty()&& nums[stack.peek()]<num){
                res[stack.pop()]=num;
            }
            if(i<len){
                stack.push(i);
            }
        }
        return res;
    }
}
