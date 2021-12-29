package com.Search;

public class Binarysearch {
	 public int search(int[] nums, int target) {
	        int uplim=nums.length;
	        int lowlim=0;
	        int pos=0;
	        if(target==nums[uplim])
	        {
	        	pos=uplim;
	        }	
	        else if(target==nums[lowlim])
	        {
	        	pos=uplim;
	        }
	        return pos;
	        
	        }
}
