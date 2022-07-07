package medium;

import java.util.LinkedList;
import java.util.Queue;

/*Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

Example 1:
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

Example 2:
Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]*/

public class OddEvenLinkedList_328 {
	public ListNode oddEvenList(ListNode head) {
        Queue<ListNode> s = new LinkedList<>();
        ListNode it = head;
        boolean flag = false;
        while(it!=null){
            if(flag == true){
                s.add(it);
            }
            flag = !flag;
            it = it.next;
        }
        ListNode current = head, next = null, prev = null;
        while(current!=null && current.next!=null){
            current.next = current.next.next;
            prev = current;
            current = current.next;
        }
        if(current != null){
            prev = current;
        }
        while(!s.isEmpty()){
            prev.next = s.peek();
            prev = prev.next;
            s.remove();
        }
        if(prev != null){
            prev.next = null;
        }
        return head;
    }
}
