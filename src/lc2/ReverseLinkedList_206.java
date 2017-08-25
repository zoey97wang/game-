package lc2;

public class ReverseLinkedList_206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = head;
        head = head.next;
        tail.next = null;
        ListNode temp;
        while (head.next != null) {
            temp = head;
            head = head.next; 
            temp.next = tail;
            tail = temp;
        }
        head.next = tail;
        return head;
    }
	
	public ListNode reverseList2(ListNode head) {
        ListNode tail = null;
        ListNode temp = head;
        while (head != null) {
            temp = head.next;
            head.next = tail;
            tail = head;
            head = temp;
        }
        return tail;
    }
}
