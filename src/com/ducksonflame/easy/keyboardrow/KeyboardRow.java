package com.ducksonflame.easy.keyboardrow;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

	public String[] findWords(String[] words) {
		
		String firstRow = "[qwertyuiop]+";
		String secondRow = "[asdfghjkl]+";
		String thirdRow = "[zxcvbnm]+";
		List<String> list = new ArrayList<>();
				
		for (String s: words) {
			if (s.length() < 2) {
				list.add(s);
				continue;
			}
			
			String word = s.toLowerCase();
			
			if (word.matches(firstRow) || word.matches(secondRow) || word.matches(thirdRow))
				list.add(s);
			
		}
		
		String[] result = list.toArray(new String[list.size()]);
				
		return result;
    }
}
