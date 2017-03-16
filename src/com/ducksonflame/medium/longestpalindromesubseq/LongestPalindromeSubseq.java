package com.ducksonflame.medium.longestpalindromesubseq;

/*
 * THIS SOLUTION ASSUMES THAT ONLY A SUBSTRING OF THE S STRING CAN BE CONSIDERED
 * (NOT ANY STRING OF LETTERS THAT THE S STRING CONTAINS)
 * (TASK DESCRIPTION IS A BIT VAGUE)
 */
public class LongestPalindromeSubseq {
	
	public int longestPalindromeSubseq(String s) {
        int bestResult = 1;
		
		for (int i = 1; i < s.length() - 1; i++) {
			int tempResult = 1;
			
			for (int j = 1; i-j > -1 && i + j < s.length(); j++) {
				if (s.charAt(i-j) == s.charAt(i+j)) {
					tempResult += 2;
				}
				else {
					break;
				}
			}
			
			if (tempResult > bestResult)
				bestResult = tempResult;
		}
		
		for (int i = 0; i < s.length() - 1; i++) {
			int tempResult = 0;
			
			for (int j = 0; i - j > -1 && (i+1) + j < s.length(); j++) {
				if (s.charAt(i-j) == s.charAt((i+1) + j)) {
					tempResult += 2;
				}
				else {
					break;
				}
			}
			
			if (tempResult > bestResult)
				bestResult = tempResult;
		}
		
		return bestResult;
    }
}
