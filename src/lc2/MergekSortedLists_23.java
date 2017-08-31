package lc2;

public class MergekSortedLists_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len < 1)
            return null;
        int index = 0;
        if (len == 1)
            return lists[0];
        ListNode[] newList = new ListNode[len - len/2];
        for (int i = 0; i < len - 1; i++) {
            newList[index] = mergeList(lists[i], lists[++i]);
            index++;
        }
        if (index < newList.length) {
            newList[index] = lists[len - 1];
        }
        return mergeKLists(newList);
    }
    public ListNode mergeList(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(0);
        ListNode newHead = dummy;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                dummy.next = h1;
                h1 = h1.next;
            } else {
                dummy.next = h2;
                h2 = h2.next;
            }
            dummy = dummy.next;
        }
        if (h1 != null) {
            dummy.next = h1;
        } else {
            dummy.next = h2;
        }
        return newHead.next;
    }

}
