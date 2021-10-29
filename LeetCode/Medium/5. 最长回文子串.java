// Solution: dynamic programming
// Difficulty level: medium

class Solution {
    public String longestPalindrome(String s) {

    	int n = s.length(), maxLength = 0;
    	String answer = new String();
    	boolean[][] dp = new boolean[n][n];

    	for(int i = 0; i < n; ++i) {
    		dp[i][i] = true;
    	}

        answer = s.substring(0, 1);
    	for(int length = 2; length <= n; ++length) {
    		for(int i = 0; i < n; ++i) {
    			int j = i + length - 1;
    			if(j >= n) break;
    			if(s.charAt(i) == s.charAt(j)) {
					if(i + 1 == j) {
						dp[i][j] = true;
    				} else {
    					dp[i][j] = dp[i + 1][j - 1];
    				}	
    			} else {
    				dp[i][j] = false;
    			}
    			if(dp[i][j] == true && length > maxLength) {
    				answer = s.substring(i, j+1);
    				maxLength = length;
    			}
    		}
    	}
        return answer;
    }
}

// Solution: Center spread algorithm
// Difficulty level: medium

class Solution {
    public String longestPalindrome(String s) {
    	String answer = s.substring(0, 1);

    	int n = s.length();

    	for(int i = 0; i < n; ++i) {
    		int length1 = getMaxLength(s, i, i);
    		int length2 = getMaxLength(s, i, i+1);
    		int maxLength = Math.max(length1, length2);
    		if(maxLength > answer.length()) {
    			answer = s.substring(i - (maxLength-1) / 2, i + 1 + maxLength / 2);
    		}
    	}
    	return answer;
    }

    public int getMaxLength(String s, int start, int end) {
    	if(end >= s.length()) return 0;
    	int maxLength = 0;
    	while(s.charAt(start) == s.charAt(end)) {
    		maxLength = Math.max(end - start + 1, maxLength);
    		--start;
    		++end;

    		if(start < 0 || end >= s.length()) break;
    	}
    	return maxLength;
    }
}

// Solution: Manacher algorithm
// Difficulty level: medium

class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = -1;
        StringBuffer sb = new StringBuffer();
        
        sb.append('#');
        for(int i = 0; i < s.length(); ++i) {
            sb.append(s.charAt(i));
            sb.append('#');
        }

        int n = sb.length();
        List<Integer> armLen = new ArrayList<Integer>();
        int right = -1, j = -1;
        for(int i = 0; i < n; ++i) {
            int currentArmLen;
            if(right >= i) {
                int i_symmetry = j * 2 - i;
                int minArmLen = Math.min(armLen.get(i_symmetry), right - i);
                currentArmLen = expand(sb, i - minArmLen, i + minArmLen);
            } else {
                currentArmLen = expand(sb, i, i);
            }

            armLen.add(currentArmLen);
            //System.out.println(currentArmLen);
            if(i + currentArmLen > right) {
                j = i;
                right = i + currentArmLen;
            }
            if(currentArmLen * 2 + 1 > end - start) {
                start = i - currentArmLen;
                end = i + currentArmLen;
            } 
        }
        //System.out.println(start + " " + end);
        StringBuffer answer = new StringBuffer();
        for(int i = start; i <= end; ++i) {
            if(sb.charAt(i) != '#') {
                answer.append(sb.charAt(i));
            }
        }
        return answer.toString();
        
    }

    public int expand(StringBuffer sb, int start, int end) {
        while(start >= 0 && end < sb.length() && sb.charAt(start) == sb.charAt(end)){
            --start;
            ++end;
        }
        //System.out.println(start + " " + end);
        return (end - start - 2) / 2;
    }
}