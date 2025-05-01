package az.edu.module02.dsa.leetcode;

class ListNode {
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

class Solution3 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode myList = new ListNode(-1);
        ListNode result = myList;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                myList.next = list1;
                list1 = list1.next;
            } else {
                myList.next = list2;
                list2 = list2.next;
            }
            myList = myList.next;
        }

        if (list1 != null) {
            myList.next = list1;
        }
        if (list2 != null) {
            myList.next = list2;
        }

        return result.next;

    }
}

public class ListNodeDemo {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution3 solution = new Solution3();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}