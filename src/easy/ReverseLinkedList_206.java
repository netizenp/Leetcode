package easy;

public class ReverseLinkedList_206 {
	public ListNode reverseList(ListNode head) {
        ListNode h = head;
        ListNode prev = null;
        ListNode next = null;
        while(h!=null){
            next = h.next;
            h.next = prev;
            prev = h;
            h = next;
        }
        return h = prev;
    }
}
