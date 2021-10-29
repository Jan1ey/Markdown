// Salution: HashSet
// Difficulty Level: easy

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        HashSet<ListNode> set = new HashSet<ListNode>();


        ListNode thisNode = new ListNode(0, head);
		thisNode = thisNode.next;
        while(thisNode != null) {

        	if(set.contains(thisNode)) {
        		return true;
        	} else {
        		set.add(thisNode);
        	}

        	thisNode = thisNode.next;
        }

        return false;
    }
}

//===============================================================

// Salution: slow and fast pointer
// Difficulty Level: easy

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

    	if(head == null || head.next == null) {
    		return false;
    	}
        
    	ListNode slow = head;
    	ListNode fast = head.next;

    	while(slow != fast) {

    		if(fast == null || fast.next == null) {
    			return false;
    		}

    		slow = slow.next;
    		fast = fast.next.next;
    	}

    	return true;
    }
}