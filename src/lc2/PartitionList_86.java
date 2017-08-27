package lc2;

public class PartitionList_86 {

	public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null && head.val < x) {
            head = head.next;
            pre = pre.next;
        }
        while (head != null && head.next != null) {
            if (head.next.val < x) {
                ListNode temp = head.next;
                head.next = head.next.next;
                ListNode temp2 = pre.next;
                pre.next = temp;
                temp.next = temp2;
                pre = pre.next;
            } else {
                head = head.next;
            }
        }
        return dummy.next;
    }
	
}
