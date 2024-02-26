class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode current = head;

        // First iteration to count the number of nodes
        while (current != null) {
            count++;
            current = current.next;
        }

        // Reset current pointer for the second iteration
        current = head;

        // Second iteration to find the second middle node
        for (int i = 0; i < count / 2; i++) {
            current = current.next;
        }

        return current;
    }
}