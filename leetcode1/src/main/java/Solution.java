
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode header = null;
        ListNode tail = null;
        boolean upbit = false;

        for (; ;) {
            int a = 0;
            int b = 0;
            int c = 0;

            if (upbit) {
                c = 1;
                upbit = false;
            }

            if (l1 != null) {
                a = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                b = l2.val;
                l2 = l2.next;
            }

            if (a + b + c > 9) {
                upbit = true;
            }
            int n = (a + b +c) % 10;
            if (header == null) {
                header = new ListNode(n);
                tail = header;
            } else {
                tail.next = new ListNode(n);
                tail = tail.next;
            }

            if (l1 == null && l2 == null) {
                break;
            }
        }

        if (upbit) {
            tail.next = new ListNode(1);
        }

        return header;
    }

    static public void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution s = new Solution();
        ListNode result = s.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
