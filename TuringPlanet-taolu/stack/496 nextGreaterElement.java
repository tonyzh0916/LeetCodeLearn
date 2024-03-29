import java.util.HashMap;
import java.util.Stack;

class Solution{
    public int[] nextGreaterElement(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int n : nums2){
            while(!stack.isEmpty() && stack.peek()<n){
                map.put(stack.pop(), n);
            }
            stack.push(n);
        }

        for(int i=0; i<nums1.length; i++){
            nums1[i]=map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }

    public int[] nextGreaterElement2(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num : nums2){
            if(!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for(int i=0; i<nums1.length;i++){
            nums1[i]=map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }

    public int[] nextGreaterElement3(int[] nums1, int nums2){
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums2){
            while(!stack.isEmpty() && stack.peek()<n){
                map.put(stack.pop(), n);
            }
            stack.push(n);
        }

        for(int n=0; n<nums1.length; n++){
            nums1[n]=map.getOrDefault(nums1[n], -1)
        }
        return nums1;
    }

}