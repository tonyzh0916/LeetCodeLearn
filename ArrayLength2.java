// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.


//小结
/*
======int convert to String ======

int i=10;  
String s=String.valueOf(i);//Now it will return "10"  

int i=10;  
String s=Integer.toString(i);//Now it will return "10" 

=====String to int =========
int i=Integer.parseInt("200");  
Integer i=Integer.valueOf("200");

*/

public class ArrayLength2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {437,315,322,431,686,264,442};
		//[437,315,322,431,686,264,442]
		System.out.println(findNumbers2(arr));

	}
	
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int item : nums ){
           String digitals= String.valueOf(item);
            if((digitals.length())%2==0){
                count++;
            }
        }
        return count;
    }
    
    public static int findNumbers2(int[] nums) {
        int count = 0;
        int temp =0;
        for(int item : nums ){
        	while(item>=1) {
        		System.out.println("item "+item);
        		item =item/10;
        		System.out.println("itme/10 "+item);
        		temp++;
        		System.out.println("temp "+temp);
        	}
        	if(temp%2==0) {
        		count++;
        	}
        	temp=0;
        }
        return count;
    }
	
}