package lc2;

public class SortList_148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Solution {
	    public ListNode sortList(ListNode head) {
	        if (head == null || head.next == null)
	            return head;
	        ListNode mid = findMiddle(head);
	        ListNode temp = mid.next;
	        mid.next = null;
	        ListNode a = sortList(head);
	        ListNode b = sortList(temp);
	        head = MergeList(a, b);
	        return head;
	    }
	    
	    public ListNode findMiddle(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head.next;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }
	    
	    public ListNode MergeList(ListNode a, ListNode b) {
	        ListNode dummy = new ListNode(0);
	        ListNode tail = dummy;
	        while (a != null || b != null) {
	            if (a == null) {
	                tail.next = b;
	                break;
	            } else if (b == null) {
	                tail.next = a;
	                break;
	            } else if (a.val < b.val) {
	                tail.next = a;
	                a = a.next;
	            } else {
	                tail.next = b;
	                b = b.next;
	            }
	            tail = tail.next;
	        }
	        return dummy.next;
	    }
	}
}
