package LeetCode;

public class MergeTwo_SortedLists {
    public static void main(String[] args) {
//    Input: list1 = [1,2,4], list2 = [1,3,4]
//    Output: [1,1,2,3,4,4]
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(1);
        list1.next = new ListNode(2); list1.next.next = new ListNode(4);
        list2.next = new ListNode(3); list2.next.next = new ListNode(4);
        Solution sol = new Solution();
        sol.mergeTwoLists(list1, list2);
        list1.printList(list1); // Print the merged list
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

