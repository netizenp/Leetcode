package medium;

import java.util.Stack;

/*You are given the head of a singly linked-list. The list can be represented as:

L0 -> L1 -> .. -> Ln - 1 -> Ln
Reorder the list to be on the following form:

L0 -> Ln -> L1 -> Ln - 1 -> L2 -> Ln - 2 -> ..
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

Example 1:

Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:

Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]*/

public class ReorderList_143 {
	public void reorderList(ListNode head) {
        Stack<ListNode> s = new Stack<>();
        ListNode node = head;
        int nodeCount = 0;
        while(node!=null){
            nodeCount++;
            s.push(node);
            node = node.next;
        }
        node = head;
        boolean flag = true;
        ListNode tempNode = null;
        while(true){
            if(flag == true){
                flag = false;
                tempNode = node.next;
                node.next = s.pop();
                node = node.next;
            }
            else if(flag == false){
                flag = true;
                node.next = tempNode;
                node = node.next;
            }
            nodeCount--;
            if(nodeCount == 0){
                node.next = null;
                break;
            }
        }
    }
}
