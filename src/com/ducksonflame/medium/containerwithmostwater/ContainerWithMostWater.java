package com.ducksonflame.medium.containerwithmostwater;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		
		int maxArea = 0;
		int a = 0;
		int b = 0;
		
        for (int i = 0; i < height.length-1; i++) {
        
        	if (height[i] > a) {
        		a = height[i];
         		
        		for (int j = height.length-1; j > i; j--) {
        			
        			b = height[j];
        			
        			if(b >= a) {
        			            				
        				if (a*(j-i) > maxArea) {
    						maxArea = a*(j-i);
        				}
        				break;
        				
        			}
        			else if (b*(j-i) > maxArea) {
						maxArea = b*(j-i);
    				}
        		}        		
        	}
        }
        
        return maxArea;
    }

}
