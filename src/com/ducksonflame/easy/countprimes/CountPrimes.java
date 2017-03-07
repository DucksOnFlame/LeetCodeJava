package com.ducksonflame.easy.countprimes;

public class CountPrimes {
	    
	public int countPrimes(int n) {
        
		int count = 0;
        boolean[] notPrime = new boolean[n];
        
        for (int i = 2; i < n; i++) {
        	if(notPrime[i] == false) {
        		count++;
        		
        		for (int j = 2; j*i < n; j++) {
        			notPrime[i*j] = true;
        		}
        	}   	
        }
        
        return count;
	}
}
