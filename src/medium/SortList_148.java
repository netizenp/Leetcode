package medium;

import java.util.PriorityQueue;

/*Given the head of a linked list, return the list after sorting it in ascending order.
 * 
Example 1:
Input: head = [4,2,1,3]
Output: [1,2,3,4]

Example 2:
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

Example 3:
Input: head = []
Output: []*/

public class SortList_148 {
	
	public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        PriorityQueue<Integer> q = new PriorityQueue<>();
        ListNode curr = head;
        while(curr != null) {
            q.add(curr.val);
            curr =curr.next;
        }
        curr = head;
        while(curr != null && !q.isEmpty()) {
            curr.val = q.poll();
            curr=curr.next;
        }
        return head;
    }

}
