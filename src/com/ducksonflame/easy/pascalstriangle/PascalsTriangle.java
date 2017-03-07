package com.ducksonflame.easy.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0)
        	return new ArrayList<>();
    	
    	List<List<Integer>> result = new ArrayList<>();
    	List<Integer> first = new ArrayList<>();
    	first.add(1);
    	result.add(first);
    	
    	for (int i = 1; i < numRows; i++) {
    		List<Integer> temp = new ArrayList<>();
    		temp.add(1);
    		
    		for (int j = 1; j < i; j++) {
    			List<Integer> prev = result.get(result.size()-1);
    			temp.add(prev.get(j-1)+prev.get(j));
    		}
    		
    		temp.add(1);
    		
    		result.add(temp);
    	}
    	
    	return result;
    }
}