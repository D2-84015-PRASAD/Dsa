package Question_1;

import java.util.Stack;

public class Solution {

// in FIRST way
// time complexity is O(n).
//space complexity is O(1)
	public static boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}

// in SECOND way
// time complexity is O(n).
//space complexity is O(1)
	public static boolean isPalindromeOptimized(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

// 3rd way stack-Based Method (for strings/linked lists)
// Time Complexity𝑂 ( 𝑛 ) O(n) - Linear time for traversing and comparing.
	boolean isPalindrome2(String s) {
		Stack<Character> stack = new Stack<>();
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			stack.push(s.charAt(i));
		}
		for (int i = (len + 1) / 2; i < len; i++) {
			if (stack.pop() != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

// 4th way
//Time Complexity O(1)
//Space Complexity O(n)
	boolean isPalindrome4(String s) {
		return isPalindromeHelper(s, 0, s.length() - 1);
	}

	boolean isPalindromeHelper(String s, int left, int right) {
		if (left >= right) {
			return true;
		}
		if (s.charAt(left) != s.charAt(right)) {
			return false;
		}
		return isPalindromeHelper(s, left + 1, right - 1);
	}

}
