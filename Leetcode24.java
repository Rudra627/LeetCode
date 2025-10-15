/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
          if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head.next;
        ListNode prev = null;

        while (first != null && second != null) {
            ListNode third = second.next; // save next node

            // swap
            second.next = first;
            first.next = third;

            if (prev != null) {
                prev.next = second;
            } else {
                head = second; // update head for the first swap
            }

            // move forward
            prev = first;
            first = third;
            if (first != null) {
                second = first.next;
            } else {
                second = null;
            }
        }
        return head;
    }

    // helper function to build LL from array
    public ListNode llBuilder(int arr[]) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    // helper function to print LL
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        ListNode hd = s.llBuilder(arr);

        ListNode head = s.swapPairs(hd);

        // print result
        s.printList(head);
    }
    }
