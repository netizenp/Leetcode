package easy;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class IntersectionOfTwoLinkedLists_160 {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode A = headA;
		ListNode B = headB;
		int countA = 0, countB = 0;
		while (A != null) {
			countA++;
			A = A.next;
		}
		while (B != null) {
			countB++;
			B = B.next;
		}
		A = headA;
		B = headB;
		int temp = 0;
		if (countA > countB) {
			temp = (countA - countB);
			while (temp-- > 0) {
				A = A.next;
			}
		} else if (countA < countB) {
			temp = (countB - countA);
			while (temp-- > 0) {
				B = B.next;
			}
		}
		while (A != null && B != null) {
			if (A == B) {
				return A;
			}
			A = A.next;
			B = B.next;
		}
		return null;
	}

}
