// Solution: HashMap
// Difficulty level: easy

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> answer = new LinkedList<Integer>();

    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    	for(int i = 0; i < nums.length; ++i) {
    		if(!map.containsKey(nums[i])) {
    			map.put(nums[i], 1);
    		}
    	}

    	for(int i = 1; i <= nums.length; ++i) {
    		if(!map.containsKey(i)) {
    			answer.add(i);
    		}
    	}
    	
    	return answer;
    }	
}

// Solution: Math
// Difficulty level: easy

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> answer = new LinkedList<Integer>();

    	for(int i = 0; i < nums.length; ++i) {
    		nums[(nums[i]-1)%nums.length] += nums.length;
    	}

    	for (int i = 0; i < nums.length; ++i) {
    		if(nums[i] <= nums.length) {
    			answer.add(i+1);
    		}
    	}

    	return answer;
    }
}