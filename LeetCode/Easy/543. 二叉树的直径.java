// Solution: recursion
// Difficulty level: easy

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
	private int ans = -1;
    public int diameterOfBinaryTree(TreeNode root) {
    	recursion(root);
    	return ans;
    }

    public int recursion(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}

    	int leftLength = recursion(root.left);
    	int rightLength = recursion(root.right);

    	ans = Math.max(ans, leftLength+rightLength);

    	return Math.max(leftLength+1, rightLength+1);
    }
}