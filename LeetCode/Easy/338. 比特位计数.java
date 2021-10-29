// Solution: &
// Difficulty level: easy

class Solution {
    public int[] countBits(int n) {
    	int[] ans = new int[n+1];

    	for(int i = 0; i <= n; ++i) {
    		ans[i] = 0;
    		int num = i;
    		while(num > 0) {
    			if((num & 1) == 1) {
    				ans[i]++;
    			}
    			num = num >> 1;
    		}
    	}

    	return ans;
    }
}


// Solution: dynamic programming Math
// Difficulty level: easy

class Solution {
    public int[] countBits(int n) {
    	int[] ans = new int[n+1];

    	int highBit = 0;
    	for(int i = 1; i <= n; ++i) {
    		if((i & (i-1)) == 0) {
    			highBit = i;
    		}
    		ans[i] = ans[i-highBit] + 1;
    	}
    	return ans;
    }
}