package medium;

/*Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]

Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1]*/

public class SwapNodesInPairs_24 {
	public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        ListNode temp = null;
        ListNode prev = null;
        while(node != null && node.next!=null){
            temp = node.next;
            if(prev!=null){
                prev.next = temp;
            }
            node.next = node.next.next;
            temp.next = node;
            if(node == head){
                head = temp;
            }
            prev = node;
            node = node.next;
        }
        return head;
    }
}
