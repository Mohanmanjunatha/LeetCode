public class Solution {

    public ListNode detectCycle(ListNode head) {
        // Step 1: Detect if there is a cycle using Floyd's Tortoise and Hare algorithm
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Cycle detected, break the loop
                break;
            }
        }

        // If there's no cycle, return null
        if (fast == null || fast.next == null) {
           return null;
       }

        // Step 2: Find the start of the cycle
        // Reset one pointer to the head and move both pointers at the same speed until they meet
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Now slow and fast point to the start of the cycle
        return slow;
    }
}