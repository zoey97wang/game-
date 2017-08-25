package lc2;

public class ReverseLinkedListII_92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
        int counter = 1;
        ListNode pre = new ListNode(1);
        pre.next = head;
        ListNode begin = pre;
        ListNode end;
        ListNode temp = head;
        while (temp != null) {
            if (counter == m) {
                begin = pre;
                end = temp;
                while (m <= counter && counter <= n) {
                    ListNode tran = temp;
                    temp = temp.next;
                    counter++;
                    tran.next = pre;
                    pre = tran;
                }
                begin.next = pre;
                end.next = temp;
            } else {
                temp = temp.next;
                pre = pre.next;
                counter++;
            }
        }
        return m==1 ? begin.next:head;
    }
	
}
