// Solution: recursion
// Difficulty level: easy
/**
 *
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
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();

    	if(root == null) {
    		return list;
    	}

    	search(root, list);

    	return list;
    }

    public void search(TreeNode root, List<Integer> list) {
    	if (root == null) {
    		return;
    	}

    	if(root.left != null) {
			search(root.left, list);
			//list.add(root.left.val);
		}

		list.add(root.val);

		if(root.right != null) {
			search(root.right, list);
			//list.add(root.right.val);
		}
		return;
    }
}

//==============================================================


// Solution: iterator
// Difficulty level: easy
// /**
//  *
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
    public List<Integer> inorderTraversal(TreeNode root) {
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	List<Integer> list = new ArrayList<Integer>();

    	TreeNode currentNode = root;

    	while(!stack.empty() || currentNode != null) {

    		while(currentNode != null) {
    			stack.push(currentNode);
    			currentNode = currentNode.left;
    		}

    		currentNode = stack.pop();
    		list.add(currentNode.val);
    		currentNode = currentNode.right;
    	}

    	return list;
    }
}

//============================================================



// Solution: moriis
// Difficulty level: easy
// /**
//  *
//  *
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
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();

    	TreeNode currentNode = root;

    	while(currentNode != null) {
    		if(currentNode.left == null) {
    			list.add(currentNode.val);
    			currentNode = currentNode.right;
    		} else {
    			TreeNode previousNode = currentNode.left;
    			while(previousNode.right != null && previousNode.right != currentNode) {
    				previousNode = previousNode.right;
    			}
    			if(previousNode.right == null) {
    				previousNode.right = currentNode;
    				currentNode = currentNode.left;
    			} else {
    				list.add(currentNode.val);
    				previousNode.right = null;
    				currentNode = currentNode.right;
    			}
    		}
    	}
    	return list;
    }
}