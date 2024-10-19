public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(9);
        ListNode a2 = new ListNode(9);
        ListNode a3 = new ListNode(9);
        ListNode a4 = new ListNode(9);
        ListNode a5 = new ListNode(9);
        ListNode a6 = new ListNode(9);
        ListNode a7 = new ListNode(9);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        a6.next = a7;

        ListNode b1 = new ListNode(9);
        ListNode b2 = new ListNode(9);
        ListNode b3 = new ListNode(9);
        ListNode b4 = new ListNode(9);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;

        ListNode k = Solution.addTwoNumbers(a1, b1);
        StringBuilder b = new StringBuilder();
        while (k != null) {
            b.append(k.val);
            k = k.next;
        }
        System.out.println(b);
    }

    private static class Solution {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int carry = 0;
            ListNode root = new ListNode();
            ListNode temp = root;
            while (l1 != null || l2 != null) {
                int sum = 0;
                if (l1 == null) {
                    sum = l2.val + carry;
                } else if (l2 == null) {
                    sum = l1.val + carry;
                } else {
                    sum = l1.val + l2.val + carry;
                }
                temp.next = new ListNode(sum % 10);
                carry = sum / 10;
                temp = temp.next;
                l1 = l1 != null ? l1.next : null;
                l2 = l2 != null ? l2.next : null;
            }
            if (carry > 0) {
                temp.next = new ListNode(carry);
            }
            return root.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
