package com.manish.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.manish.substring.LongestSubstring;

class LongestSubstringTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		LongestSubstring lst = new LongestSubstring();
		lst.nonRepeatingSubstring("abcaded");
		System.out.println(lst.longestString+"   "+lst.maxLen);
		assertEquals(lst.maxLen, 5, "passed");
	}

}
