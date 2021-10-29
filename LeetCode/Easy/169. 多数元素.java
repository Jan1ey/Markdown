// Salution: HashMap
// Difficulty Level: easy


class Solution {
    public int majorityElement(int[] nums) {

    	HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();

    	for(int i : nums) {
    		if(numMap.containsKey(i)) {
    			numMap.replace(i, numMap.get(i)+1);
    		} else {
    			numMap.put(i, 1);
    		}
    	}

    	int answer = 0;
    	for(int i : nums) {
    		if(numMap.get(i) > nums.length/2) {
    			answer = i;
    			break;
    		}
    	}
    	return answer;
    }
}

// Salution: Boyer-Moore 投票算法
// Difficulty Level: easy

class Solution {
    public int majorityElement(int[] nums) {
    	int elment = nums[0];
    	int counts = 0;

    	for(int i : nums) {
    		if(counts == 0) {
    			elment = i;
    		}
    		if(elment == i) {
    			counts++;
    		} else {
    			counts--;
    		}
    	}
    	return elment;
    }
}