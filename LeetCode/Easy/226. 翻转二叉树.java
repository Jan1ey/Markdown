// Salution: recursion
// Difficulty Level: easy

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
    public TreeNode invertTree(TreeNode root) {
    	recursion(root);
    	return root;
    }	

    public void recursion(TreeNode root) {
    	if(root == null) {
    		return ;
    	}

    	recursion(root.left);
    	recursion(root.right);

    	TreeNode exchangeNode = root.left;
    	root.left = root.right;
    	root.right = exchangeNode;

    	return ;
    }
}