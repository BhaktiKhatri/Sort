package Sort;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 179. Largest Number
 * https://leetcode.com/problems/largest-number/description/
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330. Note: The result may be very large, so you need to return a string instead of an integer.
 * Explanation and Code from: https://leetcode.com/problems/largest-number/discuss/53158/My-Java-Solution-to-share https://leetcode.com/problems/largest-number/solution/
 * https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
 * Medium
 */

public class LargestNumber {

	public static String largestNumber(int[] nums) {
        
		//Get input integers as strings
        String[] asStrs = new String[nums.length];
        
        System.out.println(Arrays.toString(asStrs));
        
        for(int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        System.out.println(Arrays.toString(asStrs));

        //Sort strings according to custom comparator
        //Comparator to decide which string should come first in concatenation
     	Comparator<String> comp = new Comparator<String>() {
     		    @Override
     		    public int compare(String str1, String str2) {
     		    	System.out.println("==========================str1: "+str1+" ======================str2: "+str2);
     		    	
     		        String s1 = str1 + str2;
     		        String s2 = str2 + str1;
     		        
     		        System.out.println("s1: "+s1+" s2: "+s2+" s2.compareTo(s1): "+s2.compareTo(s1));
     		        
     		        return s2.compareTo(s1); // reverse order here, so we can do append() later
     		    }
     	    };
        
        Arrays.sort(asStrs, comp);
        System.out.println(Arrays.toString(asStrs));
        
        //If, after being sorted, the largest number is `0`, the entire number is zero
        if(asStrs[0].equals("0")) {
            return "0";
        }

        //Build largest number from sorted array
        String largestNumberStr = "";
        
        for(String numAsStr: asStrs) {
        	System.out.println("numAsStr: "+numAsStr+" largestNumberStr: "+largestNumberStr);
        	
        	largestNumberStr = largestNumberStr + numAsStr;
        }
        System.out.println("largestNumberStr: "+largestNumberStr);
        
        return largestNumberStr;
    }
	
	public static void main(String[] args) {
		int[] nums = {3, 30, 34, 5, 9};
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println(largestNumber(nums));
	}

}
