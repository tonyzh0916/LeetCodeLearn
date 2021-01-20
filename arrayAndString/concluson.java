public class Conclusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-100,3,99};
		int k = 2;
		String s="Let's take LeetCode contest";
		reverseWords2(s);

	}
	
    public static void rotate(int[] nums, int k) {
        int[] newNums = new int[nums.length];
        if (nums.length>k) {
            for(int i=0; i<nums.length;i++){
                 newNums[((i+k)%(nums.length))]=nums[i];
                
         }  
        }
        System.out.println(Arrays.toString(newNums));
    }
    
    public static String reverseWords(String s) {
    	String[] stringArray = s.trim().split(" ");
    	StringBuilder newString = new StringBuilder();
    	for(int i=stringArray.length-1;i>=0;i--) {
    		if(!stringArray[i].isEmpty()) {
    			newString.append(stringArray[i]);
    			newString.append(" ");
    		}
    	}    	
        return newString.toString().trim();
    }
    
    public static String reverseWords2(String s) {
    	String[] stringArray = s.split(" ");
    	StringBuilder newString = new StringBuilder();
    	for(String item : stringArray) {
    		char[] newCharArray = item.toCharArray();
        	StringBuilder newString2 = new StringBuilder();
    		for(int i=newCharArray.length-1;i>=0;i--) {
    			newString2.append(newCharArray[i]);
    		}
    		newString.append(newString2);
    		newString.append(" ");
    	}
        return newString.toString().trim();
    }

}