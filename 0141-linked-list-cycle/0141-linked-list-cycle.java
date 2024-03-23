/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // Check if the linked list is empty or has only one node
        if (head == null || head.next == null) {
            return false;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            // If slow and fast pointers meet, cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // If fast pointer reaches the end of the list, no cycle exists
        return false;
    }
}
