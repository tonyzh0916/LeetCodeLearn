
public class IntroducString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack ="mississippi";
		String needle = "sipp";
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));

	}
	
    public static int strStr(String haystack, String needle) {
    	if(needle.equals("")) return 0;
    	char[] needleChar = needle.toCharArray();
    	char[] haystackChar = haystack.toCharArray();
    	int needleLength = needleChar.length;
    	int haystackLength = haystackChar.length;
//    	for(int n=0; n<needleLength;n++) {
//    		System.out.println("needleChar "+needleChar[n]);
//    	}
    	int index =-1;
    	boolean flag = false;
    	if(needleLength>haystackLength) return -1;
    	for(int i=0; i<haystackLength;i++) {
    		if(haystackChar[i]==needleChar[0]) {
    			for(int j=0; j<needleLength;j++) {
    				System.out.println("needleChar "+needleChar[j]);
    				if(i+j<=haystackLength-1 && haystackChar[i+j]==needleChar[j]) {
    					System.out.println(haystackChar[i+j]);
    					System.out.println(needleChar[j]);
    					System.out.println();
    					index=i;
    					flag= true;
    				}else {
    					flag =false;
    					break;
    				}
    			}
    			if(flag==true) {
    				return index;
    			}
    		}
    	}
    	
        return -1;
    }
    
    public static String longestCommonPrefix(String[] strs) {
    	if (strs.length==0) return "";
        int length = strs[0].length();
        boolean flag = false;
        String subString="";
        for(int i=length; i>0;i--) {
        	 subString = strs[0].substring(0, i);
        	 for(int j=1; j<strs.length;j++) {
        		 if(strs[j].indexOf(subString)!=0) {
        			 flag=false;
        			 break;
        		 }else {
        			 flag=true;
        		 }
        	 }
        	 
        	 if(flag) {
        		 return subString;
        	 }
        }
        	return "";
   
    }

}