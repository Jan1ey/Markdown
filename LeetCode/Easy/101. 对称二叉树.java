// Solution: recursion
// Difficulty level: easy
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
class Solution {
    public boolean isSymmetric(TreeNode root) {
    	return deepFirstSearch(root.left, root.right);
    }

    public boolean deepFirstSearch(TreeNode left, TreeNode right) {
    	if(left != null && right != null) {
    		return deepFirstSearch(left.left, right.right) && (left.val == right.val) 
    				&& deepFirstSearch(left.right, right.left);
    	} else {
    		if(left == null && right == null) {
    			return true;
    		} else {
    			return false;
    		}
    	}
    }
}

// =========================================================


// Solution: iteration
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
    public boolean isSymmetric(TreeNode root) {

    	return breadthFirstSearch(root);

    }

    public boolean breadthFirstSearch(TreeNode root) {

    	Queue<TreeNode> queueTreeNode = new LinkedList<TreeNode>();

    	queueTreeNode.offer(root);
    	queueTreeNode.offer(root);

    	TreeNode left = new TreeNode();
    	TreeNode right = new TreeNode();

    	while(!queueTreeNode.isEmpty()) {
    		left = queueTreeNode.poll();
    		right = queueTreeNode.poll();

    		if(left == null && right == null) {
    			continue;
    		}

    		if((left == null || right == null) || (left.val != right.val)) {
    			return false;
    		}
    		queueTreeNode.offer(left.left);
    		queueTreeNode.offer(right.right);
    		
    		queueTreeNode.offer(left.right);
    		queueTreeNode.offer(right.left);
    	}
    	return true;
    }	
}