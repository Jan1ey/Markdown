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
    public ListNode reverseList(ListNode head) {
    	ListNode recursionNode = new ListNode(0, head);
    	
    	Stack<ListNode> nodeStack = new Stack<ListNode>();

    	while(recursionNode.next != null) {
    		recursionNode = recursionNode.next;
    		nodeStack.push(recursionNode);
    	}

        ListNode answerNode = new ListNode(0);
        if(!nodeStack.empty()) answerNode.next = nodeStack.peek();
    	while(!nodeStack.empty()) {
    		recursionNode.next = nodeStack.pop();
    		recursionNode = recursionNode.next;
    		recursionNode.next = null;
    	}

    	return answerNode.next;
    }
}

//=================================================================

// Salution: recursion
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
    public ListNode reverseList(ListNode head) {
    	return recursion(head);
    }

    public ListNode recursion(ListNode head) {

    	if(head == null || head.next == null) {
    		return head;
    	}

    	ListNode newHead = recursion(head.next);

    	head.next.next = head;
    	head.next = null;

    	return newHead;
    }
}

//=================================================================

// Salution: iteration
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
    public ListNode reverseList(ListNode head) {
    	ListNode prevNode = null;
    	ListNode currNode = head;
    	ListNode nextNode = new ListNode();

    	while(currNode != null) {
    		nextNode = currNode.next;
    		currNode.next = prevNode;

    		prevNode = currNode;
    		currNode =nextNode;

    	}

    	return prevNode;
    }
}