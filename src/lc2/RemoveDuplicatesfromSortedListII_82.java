package lc2;

public class RemoveDuplicatesfromSortedListII_82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode pre = new ListNode(0);
        ListNode post = head;
        dummy.next = pre;
        pre.next = head;
        while (post != null && post.next != null) {
            if (pre.next.val == post.next.val) {
                post = post.next;
                while (post != null && pre.next.val == post.val) {
                    post = post.next;
                }
                pre.next = post;
            } else {
                pre = pre.next;
                post = post.next;
            }
        }
        return dummy.next.next;
    }

}
