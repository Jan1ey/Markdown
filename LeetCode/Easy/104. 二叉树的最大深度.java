// Solution: recursion 递归
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
    public int maxDepth(TreeNode root) {
    	
    	return deepFirstSearch(root, 0);
    }	

    public int deepFirstSearch(TreeNode root, int maxDepth) {
    	if(root == null) {
    		return maxDepth;
    	}

    	maxDepth++;

    	int left = 0, right = 0;

    	if(root.left != null) left = deepFirstSearch(root.left, maxDepth);
    	if(root.right != null) right = deepFirstSearch(root.right, maxDepth);

    	return Math.max(Math.max(left, right), maxDepth);
    } 
}


// Solution: iteration 迭代
// Difficulty level: easy
/**
 * version: iteration 迭代
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
    public int maxDepth(TreeNode root) {
    	return breadthFirstSearch(root);
    }

    public int breadthFirstSearch(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	int maxDepth = 0;

    	Queue<TreeNode> queueTreeNode = new LinkedList<TreeNode>();
    	
    	queueTreeNode.offer(root);

    	while(!queueTreeNode.isEmpty()) {

    		int size = queueTreeNode.size();

    		while(size > 0) {
    			TreeNode topNode = queueTreeNode.poll();

    			if(topNode.left != null) queueTreeNode.offer(topNode.left);
    			if(topNode.right != null) queueTreeNode.offer(topNode.right);

    			size--;
    		}
    		maxDepth++;
    	}
    	return maxDepth;
    }
}