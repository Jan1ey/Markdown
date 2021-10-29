// Solution: HashSet
// Difficulty level: easy

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    	ListNode nodeA = headA;
    	ListNode nodeB = headB;
    	HashSet<ListNode> setListNode = new HashSet<ListNode>();

    	while(nodeA != null) {
    		setListNode.add(nodeA);
    		nodeA = nodeA.next;
    	}

    	while(nodeB != null) {
    		if(setListNode.contains(nodeB)) {
    			return nodeB;  
    		}
            nodeB = nodeB.next;
    	}

    	return null;
    }
}

// Solution: two pointers
// Difficulty level: easy

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        while(nodeA != nodeB) {
        	nodeA = nodeA == null ? headB : nodeA.next;
        	nodeB = nodeB == null ? headA : nodeB.next;
        }

        return nodeA;
    }
}