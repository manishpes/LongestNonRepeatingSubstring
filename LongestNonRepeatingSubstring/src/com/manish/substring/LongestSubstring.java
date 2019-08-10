package com.manish.substring;

import java.util.LinkedHashMap;

public class LongestSubstring {

	public String longestString = "";
	public int maxLen = 0;

	public void NonRepeatingSubstring(String input) {
		if (input == null || input == "") {
			return;
		}
		char[] charArray = input.toCharArray();

		LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (!charPosMap.containsKey(ch)) {
				charPosMap.put(ch, i);
			} else {
				i = charPosMap.get(ch);
				charPosMap.clear();
			}
			if(charPosMap.size()>maxLen) {
				maxLen = charPosMap.size();
				longestString = charPosMap.keySet().toString().replace(",", "");
			}
		}
	}

}
