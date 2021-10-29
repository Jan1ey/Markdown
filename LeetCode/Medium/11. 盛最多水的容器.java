// Solution: double pointer
// Difficulty level: medium 

class Solution {
    public int maxArea(int[] height) {
    	int leftPointer = 0, rightPointer = height.length - 1;
    	int answer = Integer.MIN_VALUE;

    	while(leftPointer <= rightPointer) {
    		int leftHeight = height[leftPointer], rightHeight = height[rightPointer];
    		int currentArea = Math.min(leftHeight, rightHeight) * (rightPointer - leftPointer);

    		answer = Math.max(answer, currentArea);

    		if(leftHeight < rightHeight) {
    			++leftPointer;
    		} else {
    			--rightPointer;
    		}

    	}

    	return answer; 
    }
}