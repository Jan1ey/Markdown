// Solution: bit operation
// Difficulty level: easy


class Solution {
    public int hammingDistance(int x, int y) {
    	int ans = 0;

    	while(x > 0 || y > 0) {
    		if((x&1) != (y&1)) {
    			ans++;
    		}
    		x >>= 1;
    		y >>= 1;
    	}

    	return ans;
    }
}


// Solution: Integer.bitCount
// Difficulty level: easy

class Solution {
    public int hammingDistance(int x, int y) {
    	return Integer.bitCount(x^y);
    }
}


// Solution: Brian Kernighan
// Difficulty level: easy

class Solution {
    public int hammingDistance(int x, int y) {
    	int answer = x ^ y;
    	int count = 0;

    	while(answer != 0) {
    		answer &= (answer-1);
    		count++;
    	}

    	return count;
    }
}