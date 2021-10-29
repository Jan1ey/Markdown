// Solution: sort
// Difficulty level: hard

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    	int[] mergedNums = new int[nums1.Length + nums2.length];

    	for(int i = 0; i < nums1.length; ++i) {
    		mergedNums[i] = nums1[i];
    	}

    	for(int i = 0; i < nums2.length; ++i) {
    		mergedNums[i+nums1.length] = nums2[i];
    	}

    	ArrayList.sort(mergedNums);

    	int mergedLength = nums1.length + nums2.length;
    	if((mergedLength) % 2 == 0) {
    		return (double)[(mergedNums[mergedLength/2] + mergedNums[(mergedLength/2)-1])]*1.0 / 2;
    	} else {
    		return (double)[mergedNums[mergedLength/2]];
    	}
    }
}


// Solution: binary search
// Difficulty level: hard

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length, length2 = nums2.length, mergedLength = length1 + length2;

        if(mergedLength % 2 == 1) {
            int k = mergedLength / 2;
            return (double)getKthNum(nums1, nums2, k + 1);
        } else {
            int k1 = mergedLength / 2 - 1, k2 = mergedLength / 2;
            double kNum1 = getKthNum(nums1, nums2, k1 + 1);
            double kNum2 = getKthNum(nums1, nums2, k2 + 1);
            return (double)((kNum1 + kNum2) / 2.0);
        }
    }

    public int getKthNum(int[] nums1, int[] nums2, int k) {
        int n = nums1.length, m = nums2.length;
        int index1 = 0, index2 = 0;
        while(true) {
            if(index1 == n) {
                return nums2[index2 + k - 1];
            }

            if(index2 == m) {
                return nums1[index1 + k - 1];
            }

            if(k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }
            
            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, n) - 1;
            int newIndex2 = Math.min(index2 + half, m) - 1;

            if(nums1[newIndex1] <= nums2[newIndex2]) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }
}


// Solution: devide array
// Difficulty level: hard

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n = nums1.length, m = nums2.length;
        int left = 0, right = n;
        int max_left = 0, min_right = 0;

        while(left <= right) {

            int i = (left + right) / 2;
            int j = (m + n + 1) / 2 - i;

            int i_left_max = (i == 0 ? Integer.MIN_VALUE : nums1[i - 1]);
            int i_right_min = (i == n ? Integer.MAX_VALUE : nums1[i]);
            int j_left_max = (j == 0 ? Integer.MIN_VALUE : nums2[j - 1]);
            int j_right_min = (j == m ? Integer.MAX_VALUE : nums2[j]);

            if(i_left_max <= j_right_min) {
                max_left = Math.max(i_left_max, j_left_max);
                min_right = Math.min(i_right_min, j_right_min);
                left = i + 1;
            } else {
                right = i - 1;
            }
        }
        return (m + n) % 2 == 0 ? (max_left + min_right) / 2.0 : (double)max_left;
    }
}