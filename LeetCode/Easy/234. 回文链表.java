// Salution: Stack
// Difficulty Level: easy


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

    	ListNode newHead = head;

    	Stack<ListNode> nodeStack = new Stack<ListNode>();

    	while(newHead != null) {
    		nodeStack.push(newHead);
    		newHead = newHead.next;
    	}

    	newHead = head;
    	while(!nodeStack.empty()) {
    		ListNode topNode = nodeStack.pop();
    		if(topNode.val != newHead.val) {
    			return false;
    		}
    		newHead = newHead.next;
    	}

    	return true;
    }
}