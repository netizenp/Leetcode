package medium;

/*Given the head of a singly linked list and two integers left and right
 *  where left <= right,
 *  reverse the nodes of the list from position left to position right,
 *  and return the reversed list.
 * 
Example 1:
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]

Example 2:
Input: head = [5], left = 1, right = 1
Output: [5]*/

public class ReverseLinkedListII_92 {
	
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if(head == null || head.next == null){
            return head;
        }
        ListNode current = head, prev = null, next = null, leftMost = null, rightMost = null;
        int var = right - left + 1;
        while(left-->1){
            prev = current;
            current = current.next;
        }
        leftMost = prev;
        rightMost = current;
        while(current!=null && var > 0){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            var--;
        }
        if(leftMost!=null){
            leftMost.next = prev;
        }
        else{
            head = prev;
        }
        rightMost.next = current;
        return head;
    }

}
