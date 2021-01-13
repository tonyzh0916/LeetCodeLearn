public class IntroducAttay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,7,3,6,5,6};
		System.out.println(pivotIndex(arr));
	}
	
    public static int pivotIndex(int[] nums) {
    	int sum1=0;
    	int sum2=0;
    	for(int i=0; i<nums.length;i++) {
    		for(int m=0; m<i+1;m++) {
    			sum1+=nums[m];
 
    		}
    		 System.out.println(sum1);
    		for(int n=i;n<nums.length;n++) {
    			sum2+=nums[n];
    		
    		}
    			System.out.println(sum2);
    		if(sum1==sum2) {
    			return i;
    		}else {
    			System.out.println();
				sum1=0;
				sum2=0;
			}
    	}
        return -1;
    }

    public static int pivotIndex2(int[] nums) {
      int sum = 0, leftsum = 0;
      for (int x: nums) sum += x;
      for (int i = 0; i < nums.length; ++i) {
          if (leftsum == sum - leftsum - nums[i]) return i;
          leftsum += nums[i];
      }
      return -1;
	}
	
	//[1,2,3] -> [1,2,4]
	public int[] plusOne(int[] digits) {
		int n = digits.length;
		for(int i=n-1; i>=0; i--) {
				if(digits[i] < 9) {
						digits[i]++;
						return digits;
				}
				
				digits[i] = 0;
		}
		
		int[] newNumber = new int [n+1];
		newNumber[0] = 1;
		
		return newNumber;
}
}