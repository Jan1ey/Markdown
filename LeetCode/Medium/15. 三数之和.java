/*
 * Solution: Sort + double Pointer
 * Difficulty level: Medium 
 * Date: 2021/10/29
 * Author: Jan1ey
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> answerList = new ArrayList<>();

    	Arrays.sort(nums);

    	for(int i = 0; i < nums.length; ++i) {
    		if((i > 0) && (nums[i] == nums[i - 1])) {
    			continue;
    		}

    		int k = nums.length - 1;
    		for(int j = i + 1; j < nums.length; ++j) {
    			if((j > i + 1) && (nums[j] == nums[j - 1])) {
    				continue;
    			}

    			int a = nums[i], b = nums[j], c = nums[k];
    			
    			while((j < k) && (a + b + c > 0)) {
    				--k;
                    c = nums[k];
    			}
                
                if(j == k) {
                    break;
                }

    			if(a + b + c == 0) {
                    //System.out.println(i + " " + j + " " + k);
    				List<Integer> list = new ArrayList<Integer>();
    				list.add(a);
    				list.add(b);
    				list.add(c);
    				answerList.add(list);
    			}
    		}
    	}
    	return answerList;
    }
}