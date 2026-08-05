class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;

        while (t1 != null || t2 != null || carry != 0) {

            int sum = carry;   // start with carry

            if (t1 != null) {
                sum += t1.val;
                t1 = t1.next;
            }

            if (t2 != null) {
                sum += t2.val;
                t2 = t2.next;
            }

            carry = sum / 10;
            int val = sum % 10;

            ListNode newNode = new ListNode(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        return head;   // important
    }
}