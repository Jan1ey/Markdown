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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    	return recursion(root1, root2);
    }

     public TreeNode recursion(TreeNode rootL, TreeNode rootR) {

    	if(rootL == null) {
    		if(rootR != null) {
    			return rootR;
    		}
    		return null;
    	} else {
    		if(rootR != null) {
    			rootL.val = rootL.val + rootR.val;
    		} else {
    			return rootL;
    		}
    	}

    	TreeNode left = recursion(rootL.left, rootR.left);
    	TreeNode right = recursion(rootL.right, rootR.right);

    	rootL.left = left;
    	rootL.right = right;

    	return rootL;
    }
}

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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    	
    	if(root1 == null) {
    		return root2;
    	}
    	if(root2 == null) {
    		return root1;
    	}

    	Queue<TreeNode> queueL = new LinkedList<TreeNode>();
    	Queue<TreeNode> queueR = new LinkedList<TreeNode>();
    	Queue<TreeNode> queueMerge = new LinkedList<TreeNode>();

    	TreeNode mergeNode = new TreeNode(root1.val + root2.val);
    	queueL.offer(root1);
    	queueR.offer(root2);
    	queueMerge.offer(mergeNode);

    	while(!queueL.isEmpty() && !queueR.isEmpty()) {
    		TreeNode node = queueMerge.poll(), nodeL = queueL.poll(), nodeR = queueR.poll();
    		TreeNode leftL = nodeL.left, leftR = nodeR.left, rightL = nodeL.right, rightR = nodeR.right;
    		if(leftL != null || leftR != null) {
    			if(leftL != null && leftR != null) {
    				TreeNode left = new TreeNode(leftL.val + leftR.val);
    				node.left = left;
    				queueMerge.offer(left);
    				queueL.offer(leftL);
    				queueR.offer(leftR);
    			} else if(leftL != null) {
    				node.left = leftL;
    			} else if(leftR != null) {
    				node.left = leftR;
    			}
    		}
    		if(rightL != null || rightR != null) {
    			if(rightL != null && rightR != null) {
    				TreeNode right = new TreeNode(rightL.val + rightR.val);
    				node.right = right;
    				queueMerge.offer(right);
    				queueL.offer(rightL);
    				queueR.offer(rightR);
    			} else if(rightL != null) {
    				node.right = rightL;
    			} else if(rightR != null) {
    				node.right = rightR;
    			}
    		}
    	}
    	return mergeNode;
    }
}