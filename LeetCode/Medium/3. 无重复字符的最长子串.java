// Solution: sliding window
// Difficulty level: medium

class Solution {
    public int lengthOfLongestSubstring(String s) {

    	HashSet<char> set = new HashSet<char>();

    	int maxLength = 0, left = 0, right = 0;

    	while(right < s.length()) {
    		char ch = s.charAt(right);

    		while(set.contains(ch)) {
    			set.remove(s.charAt(left++));
    		}

    		set.add(ch);

    		maxLength = Math.max(maxLength, right-left+1);

    		right++;
    	}

    	return maxLength;
    }	
}