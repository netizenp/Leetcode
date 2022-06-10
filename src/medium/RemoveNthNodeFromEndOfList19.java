package medium;

/*Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]*/

public class RemoveNthNodeFromEndOfList19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0, head);
        ListNode node = head;
        ListNode prev = temp;
        while(n>0 && node!=null){
            node = node.next;
            n--;
        }
        while(node!=null){
            node = node.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return temp.next;
    }

}
