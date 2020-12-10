
/
/*/
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.

*/
public class ArrayLenth {

	public static void main(String[] args) {
		int[] nums = {1,0,1,1,0,1};
		
		int maxCount=findMaxConsecutiveOnes1(nums);
		System.out.println(maxCount);
    
	}
	
    public static int findMaxConsecutiveOnes1(int[] nums) {
        int count = 0;
        int temp = 0;
        for(int i=0; i<nums.length;i++) {
        	if(nums[i]==1) {
        		temp++;
        	}else {
        		count=0;
        		if(temp>count) {
        			count = temp;
        			temp=0;
        		}else {
        			temp=0;
        		}
        	}
        }
	
        return count;
    }

    static int getMaxLength(boolean arr[], int n) 
    { 
          
        int count = 0; //intitialize count 
        int result = 0; //initialize max 
      
        for (int i = 0; i < n; i++) 
        { 
              
            // Reset count when 0 is found 
            if (arr[i] == false) 
                count = 0; 
      
            // If 1 is found, increment count 
            // and update result if count becomes 
            // more. 
            else
            { 
                count++;//increase count 
                result = Math.max(result, count); 
            } 
        } 
      
        return result; 
    } 
}