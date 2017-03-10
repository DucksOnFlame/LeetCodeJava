package com.ducksonflame.medium.threesumclosest;

public class ThreeSumClosest {

	public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3)
        	return 0;
		
        int currentBest = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < nums.length - 2; i++) {
        	for (int j = i + 1; j < nums.length - 1; j++) {
        		for (int h = j + 1; h < nums.length; h++) {
        			
        			int oneSum = nums[i] + nums[j] + nums[h];
        			
        			if (oneSum - target == 0) {
        				return oneSum;
        			}
        			if (Math.abs(oneSum - target) < Math.abs(currentBest - target)) {
        				currentBest = oneSum;
        			}
        		}
        	}
        }

        return currentBest;
		
    }
}
