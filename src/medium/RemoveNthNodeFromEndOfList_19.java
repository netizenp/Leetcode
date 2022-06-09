package medium;

/*Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]*/
class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class RemoveNthNodeFromEndOfList_19 {
	//First method
//	public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode temp = new ListNode(0, head);
//        ListNode node = head;
//        ListNode prev = temp;
//        while(n>0 && node!=null){
//            node = node.next;
//            n--;
//        }
//        while(node!=null){
//            node = node.next;
//            prev = prev.next;
//        }
//        prev.next = prev.next.next;
//        return temp.next;
//    }
	
	//Second Method
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode newStart = new ListNode(0, head);
		ListNode front = newStart;
		ListNode back = null;
		while (front.next != null) {
			front = front.next;
			n--;
			if (n <= 0) {
				if (back == null) {
					back = newStart;
				} else {
					back = back.next;
				}
			}
		}
		back.next = back.next.next;
		return newStart.next;
	}
}
