// Solution: simulation
// Difficulty level: medium

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    	ListNode listTmp = new ListNode();
    	ListNode sumList = new ListNode(0, listTmp);
    	ListNode list1 = l1, list2 = l2;

    	int contribution = 0;

    	while(list1 != null || list2 != null) {
    		int num1 = 0, num2 = 0;
    		if(list1 != null) {
    			num1 = list1.val;
    			list1 = list1.next;
    		}
    		if(list2 != null) {
    			num2 = list2.val;
    			list2 = list2.next;
    		}

    		ListNode sumNode = new ListNode((num1+num2+contribution)%10); 
    		
    		listTmp.next = sumNode;
    		listTmp = listTmp.next;

    		contribution = (num1+num2+contribution)-10 >= 0 ? 1 : 0;

    	}

    	if(contribution == 1) {
    		ListNode sumNode = new ListNode(1); 
    		
    		listTmp.next = sumNode;
    	}

    	return sumList.next.next;
    }
}